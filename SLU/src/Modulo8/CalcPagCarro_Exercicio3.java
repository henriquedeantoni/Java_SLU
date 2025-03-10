package Modulo8;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class CalcPagCarro_Exercicio3 extends Application {
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculadora de Amortização de Carro");

        Label precoLabel = new Label("Custo do carro:");
        TextField precoTextField = new TextField();

        Label entradaLabel = new Label("Entrada:");
        TextField entradaTextField = new TextField();

        Button calcularButton = new Button("Calcular Parcelas");
        
        Label resultadoLabel = new Label();

        calcularButton.setOnAction(e -> {
            try {
                
                int preco = Integer.parseInt(precoTextField.getText());
                int entrada = Integer.parseInt(entradaTextField.getText());

                int prazo = 120;
                double taxaJuros = 0.055 / 12;
                
                int valorFinanciado = preco - entrada;

                double parcelaMensal = (valorFinanciado * taxaJuros) / 
                                       (1 - Math.pow(1 + taxaJuros, -prazo));

                resultadoLabel.setText(String.format("Parcela Mensal: R$ %.2f", parcelaMensal));
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Erro: Insira valores válidos.");
            }
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(precoLabel, 0, 0);
        grid.add(precoTextField, 1, 0);
        grid.add(entradaLabel, 0, 1);
        grid.add(entradaTextField, 1, 1);
        grid.add(calcularButton, 0, 2);
        grid.add(resultadoLabel, 1, 2);

        Scene scene = new Scene(grid, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
