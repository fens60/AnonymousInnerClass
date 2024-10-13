package es.ieslosmontecillos.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*
 * @author: Shangfeng Shan
 * @date:  ${date}
 * */
public class AnonymousInnerClass extends Application {

    @Override
    public void start(Stage primaryStage) {
        //crear los botones
        Button btnNuevo = new Button("Nuevo");
        Button btnAbrir = new Button("Abrir");
        Button btnGuardar = new Button("Guardar");
        Button btnImprimir = new Button("Imprimir");

        // Manejadores de eventos usando clases anónimas
        btnNuevo.setOnAction(e -> System.out.println("Nuevo Proceso"));
        btnAbrir.setOnAction(e -> System.out.println("Abrir proceso"));
        btnGuardar.setOnAction(e -> System.out.println("Guardar proceso"));
        btnImprimir.setOnAction(e -> System.out.println("Imprimir proceso"));

        //colocar los botones en un layout vertical (VBox)
        VBox layout = new VBox(10);  // Espacio entre botones
        layout.getChildren().addAll(btnNuevo, btnAbrir, btnGuardar, btnImprimir);

        //crear la escena y mostrarla
        Scene scene = new Scene(layout, 200, 200);
        primaryStage.setTitle("Ejemplo de Botones");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
