package com.rrs.cryptographerfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class EncryptorFX extends Application {

    private TextArea inputTextArea;
    private TextArea outputTextArea;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create the input and output text areas
        inputTextArea = new TextArea();
        outputTextArea = new TextArea();
        outputTextArea.setEditable(false);

        // Create the buttons
        Button encryptButton = new Button("Зашифрувати");
        Button decryptButton = new Button("Розшифрувати");

        // Set the event handlers for the buttons
        encryptButton.setOnAction(event -> encryptText());
        decryptButton.setOnAction(event -> decryptText());

        // Create the control panel
        GridPane controlPane = new GridPane();
        controlPane.setPadding(new Insets(10, 10, 10, 10));
        controlPane.setHgap(10);
        controlPane.setVgap(10);
        Label inputLabel = new Label("Введення тексту:");
        inputLabel.setStyle("-fx-text-fill: white;");
        controlPane.add(inputLabel, 0, 0);
        controlPane.add(inputTextArea, 0, 1, 2, 1);

        Label outputLabel = new Label("Вивід тексту:");
        outputLabel.setStyle("-fx-text-fill: white;");
        controlPane.add(outputLabel, 0, 2);
        controlPane.add(outputTextArea, 0, 3, 2, 1);
        controlPane.add(encryptButton, 0, 4);
        controlPane.add(decryptButton, 1, 4);

        // Add the control panel and status bar to the root pane
        root.setCenter(controlPane);

        // Create the scene and set it as the primary stage's scene
        Scene scene = new Scene(root, 650, 550);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cryptographer");

        primaryStage.show();

        // Add CSS styles for dark mode
        String darkModeCss = "-fx-background-color: #2b2b2b; " +
                "-fx-control-inner-background: #3d3d3d; " +
                "-fx-text-fill: white;";
        scene.getRoot().setStyle(darkModeCss);

        // Add instructions
        Label instructionsLabel = new Label("Щоб зашифрувати/розшифрувати текст, введіть текст у вікно \"Введення тексту\" та натисніть на відповідну кнопку. Результат з'явиться у вікні \"Вивід тексту\" і буде скопійовано автоматично до буферу обміну.");
        instructionsLabel.setStyle("-fx-text-fill: white;");
        instructionsLabel.setWrapText(true);
        controlPane.add(instructionsLabel, 0, 5, 2, 1);
    }

    private void encryptText() {
        String inputText = inputTextArea.getText();
        String encodedText = Dictionary.Encoder(inputText);
        outputTextArea.setText(encodedText);
        // Copy to clipboard
        StringSelection stringSelection = new StringSelection(encodedText);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    private void decryptText() {
        String inputText = inputTextArea.getText();
        String decodedText = Dictionary.Decoder(inputText);
        outputTextArea.setText(decodedText);
        // Copy to clipboard
        StringSelection stringSelection = new StringSelection(decodedText);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
