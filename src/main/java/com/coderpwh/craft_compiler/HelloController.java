package com.coderpwh.craft_compiler;

import com.coderpwh.craft_compiler.entity.Token;
import com.coderpwh.craft_compiler.service.SimpleLexer;
import com.coderpwh.craft_compiler.service.SimpleTokenReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloController {
    @FXML
    public TextField text;
    @FXML
    public ListView mylistview;
    @FXML
    public VBox vbox;

    @FXML
    protected void onHelloButtonClick() {
        String text = this.text.getText();
        SimpleLexer lexer = new SimpleLexer();
        SimpleTokenReader tokenReader = lexer.tokenize(text);
        String s = tokenReader.getTokenList().toString();
        ObservableList<Token> tokens = FXCollections.observableArrayList(tokenReader.getTokenList());
        mylistview.setEditable(false);
        mylistview.setItems(tokens);
    }
    @FXML
    public void openFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt","*.cpp","*.c","*.h","*.java"),
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                new FileChooser.ExtensionFilter("All Files", "*.*"));
        Window stage = vbox.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);
        System.out.println(selectedFile);
        SimpleLexer lexer = new SimpleLexer();
        List<Token> tokenList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(selectedFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuffer stringBuffer = new StringBuffer();

            bufferedReader.lines().forEach(e-> {
                stringBuffer.append(e);

            });
            SimpleTokenReader tokenize = lexer.tokenize(stringBuffer.toString());
            tokenList.addAll(tokenize.getTokenList());

/*            bufferedReader.lines().forEach(e-> {
                SimpleTokenReader tokenize = lexer.tokenize(e);
                tokenList.addAll(tokenize.getTokenList());
            });*/

            ObservableList<Token> tokens = FXCollections.observableArrayList(tokenList);
            mylistview.setEditable(false);
            mylistview.setItems(tokens);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}