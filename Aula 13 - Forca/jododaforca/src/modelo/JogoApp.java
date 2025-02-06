package modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JogoApp extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/visao/janela.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        stage.setTitle("Jogo da Forca");
        stage.setResizable(false);
        stage.setScene(tela);
        stage.show();
    }

}
