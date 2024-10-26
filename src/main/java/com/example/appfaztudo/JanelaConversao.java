package com.example.appfaztudo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JanelaConversao extends Stage {

    public JanelaConversao() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("imc-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 340);
        this.setTitle("Hello!");
        this.setScene(scene);
        this.show();
    }
}
