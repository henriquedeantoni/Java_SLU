package Modulo8;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrapbookingApp_Exercicio1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //novo grid
        GridPane gridPane = new GridPane();

        // Adicionar imagens e textos ao GridPane
        addImageWithText(gridPane, "https://pt.wikipedia.org/wiki/Torre_Eiffel#/media/Ficheiro:Tour_Eiffel_Wikimedia_Commons_(cropped).jpg", "Torre Eiffel", 0, 0);
        addImageWithText(gridPane, "https://pt.wikipedia.org/wiki/Golden_Gate#/media/Ficheiro:Golden_Gate_Bridge_1.jpg", "Golden Gate", 1, 0);
        addImageWithText(gridPane, "https://pt.wikipedia.org/wiki/Est%C3%A1tua_da_Liberdade#/media/Ficheiro:Lady_Liberty_under_a_blue_sky_(cropped).jpg", "Estatua da Liberdade", 0, 1);
        addImageWithText(gridPane, "https://pt.wikipedia.org/wiki/Templo_de_Zeus_(Ol%C3%ADmpia)", "Templo de Zeus", 1, 1);

        // Criar uma cena e adicionar o GridPane
        Scene scene = new Scene(gridPane, 800, 600);
        primaryStage.setTitle("Aplicativo de Scrapbooking");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addImageWithText(GridPane gridPane, String imageUrl, String text, int col, int row) {
        // Criar Image e ImageView
        Image image = new Image(imageUrl);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(225);
        imageView.setFitWidth(360);  
        imageView.setPreserveRatio(true); 

        // Adicionar a imagem e o texto ao GridPane
        gridPane.add(imageView, col, row);
        gridPane.add(new Text(text), col, row + 1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
