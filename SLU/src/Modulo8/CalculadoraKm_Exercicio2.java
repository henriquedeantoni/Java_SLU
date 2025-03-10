package Modulo8;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculadoraKm_Exercicio2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculadora de Quilômetros por Litro");

        // Criar componentes
        Label kmLabel = new Label("Quilómetros Percorridos:");
        TextField kmTextField = new TextField();

        Label litrosLabel = new Label("Litros Consumidos:");
        TextField litrosTextField = new TextField();

        Button calcularButton = new Button("Calcular");
        Label resultadoLabel = new Label();

        // Ação do botão calcular
        calcularButton.setOnAction(e -> {
            try {
                double km = Double.parseDouble(kmTextField.getText());
                double litros = Double.parseDouble(litrosTextField.getText());
                if (litros != 0) {
                    double kpl = km / litros;
                    resultadoLabel.setText(String.format("Quilômetros por Litro: %.2f", kpl));
                } else {
                    resultadoLabel.setText("Erro: Litros não pode ser zero.");
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Erro: Insira valores válidos.");
            }
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(kmLabel, 0, 0);
        grid.add(kmTextField, 1, 0);
        grid.add(litrosLabel, 0, 1);
        grid.add(litrosTextField, 1, 1);
        grid.add(calcularButton, 0, 2);
        grid.add(resultadoLabel, 1, 2);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
