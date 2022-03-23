package com.example.verifyuserinput;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    //create a variable that will store the users input as integer
    int age;

    public void submit (ActionEvent event){
        //if the application window is small for whatever we want to show
        //on our label when the button is pushed, we should use the set font
        //function , called only when the submit method is called
        myLabel.setFont(Font.font(23));
        try{
            //we must convert whatever the user types in the textfield to
            //string. we do that with the parseInt method
        age = Integer.parseInt(myTextField.getText());
        System.out.println(age);
        if (age>=18){
            myLabel.setText("you are now signed up");
        }else {
            myLabel.setText("you must be 18+");
        }
            }
        //here we catch a possible exception (i.e. whenthe user inputs letters)
        //and we display on our label and on command line thee apropriate message
        //we know that the name of the error is NumberFormatException
        //because if we trigger the exception without the sys out line
        //the compiler will give us the name of the error wich is NumberFormatException
        catch (NumberFormatException e){
            System.out.println("enter only numbers please");
            myLabel.setText("enter only numbers please");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}