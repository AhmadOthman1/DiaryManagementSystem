/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diarymanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HI-TECH
 */
public class FXMLSignupController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private TextField name;
    @FXML
    private TextField email;
    @FXML
    private TextField userName;
    @FXML
    private TextField password;
    @FXML
    private DatePicker birthdate;
    @FXML
    private ComboBox<?> gender;
    @FXML
    private Button signup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToLoginPane(ActionEvent event) throws IOException {
        Parent Parent = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        Scene Scene = new Scene(Parent);
        Stage Stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Stage.setScene(Scene);
        Stage.show();
    }

    @FXML
    private void goToConfirmEmail(ActionEvent event) throws IOException {
        //check all of the fields if entered correctly and show red label for the errors
        //..
        //..
        //..
        //if all fields are valid then send confirmation cod to the email go to confirmation interface:
        Parent Parent = FXMLLoader.load(getClass().getResource("FXMLEmailConfirmation.fxml"));
        Scene Scene = new Scene(Parent);
        Stage Stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Stage.setScene(Scene);
        Stage.show();
    }
    
}