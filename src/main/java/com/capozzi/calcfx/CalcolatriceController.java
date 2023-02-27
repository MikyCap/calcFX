package com.capozzi.calcfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 *
 *
 *
 */

public class CalcolatriceController {

    boolean operandoInserito = false;

    @FXML
    private Label displayText;

    @FXML
    private String displayString;
    @FXML
    private boolean flagUguale;

   /*
    @FXML
    protected void onPointButtonClick() {


        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }

        if (pointClicked){
            displayText.setText(displayString);
        }else{
            displayString = displayText.getText();
            displayString = displayString + ".";
            displayText.setText(displayString);
            pointClicked = true;
        }

    }

*/
    @FXML
    protected void on0ButtonClick() {

        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 0;
        displayText.setText(displayString);
    }

    @FXML
    protected void on1ButtonClick() {

        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 1;
        displayText.setText(displayString);
    }

    @FXML
    protected void on2ButtonClick() {


        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 2;
        displayText.setText(displayString);
    }

    @FXML
    protected void on3ButtonClick() {


        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 3;
        displayText.setText(displayString);
    }

    @FXML
    protected void on4ButtonClick() {



        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 4;
        displayText.setText(displayString);
    }

    @FXML
    protected void on5ButtonClick() {



        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 5;
        displayText.setText(displayString);
    }

    @FXML
    protected void on6ButtonClick() {



        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 6;
        displayText.setText(displayString);

    }

    @FXML
    protected void on7ButtonClick() {

        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 7;
        displayText.setText(displayString);
    }

    @FXML
    protected void on8ButtonClick() {

        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 8;
        displayText.setText(displayString);
    }

    @FXML
    protected void on9ButtonClick() {

        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 9;
        displayText.setText(displayString);

    }

    @FXML
    protected void onresetButtonClick() {
        displayText.setText("");
        operandoInserito = false;
    }

    @FXML
    protected void onpiuButtonClick() {
        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }

        if (operandoInserito){
            displayText.setText(displayText.getText());
            onUgualeButtonClick();
        }else{
            displayString = displayText.getText();
            displayString = displayString + "+";
            displayText.setText(displayString);
            operandoInserito = true;
        }
    }

    @FXML
    protected void onMenoButtonClick() {
        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }

        if (operandoInserito){
            displayText.setText(displayText.getText());
            onUgualeButtonClick();
        }else{
            displayString = displayText.getText();
            displayString = displayString + "-";
            displayText.setText(displayString);
            operandoInserito = true;
        }
    }

    @FXML
    protected void onPerButtonClick() {
        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }

        if (operandoInserito){
            displayText.setText(displayText.getText());
            onUgualeButtonClick();
        }else{
            displayString = displayText.getText();
            displayString = displayString + "*";
            displayText.setText(displayString);
            operandoInserito = true;
        }
    }

    @FXML
    protected void onDivButtonClick() {
        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }


        if (operandoInserito){
            displayText.setText(displayText.getText());
            onUgualeButtonClick();
        }else{
            displayString = displayText.getText();
            displayString = displayString + "/";
            displayText.setText(displayString);
            operandoInserito = true;
        }
    }


    @FXML
    protected void onUgualeButtonClick(){

        boolean trovato = false;

        double risultato = 0;
        double operando1,operando2;
        String Soperando1 = "",Soperando2 = "";

        int indexOperatore = 0;
        char operatore = '+';
        int i,j;

        if (!operandoInserito){
            displayText.setText(displayText.getText());
        }else{
            for (i=0;i<displayString.length();i++){
                switch (displayString.charAt(i)) {
                    case '+', '-', '*', '/' -> {
                        operatore = displayString.charAt(i);
                        indexOperatore = i;
                    }
                }
            }

            for (i=0;i<indexOperatore;i++){
                Soperando1 += displayString.charAt(i);
            }

            for (i=indexOperatore+1;i<displayText.getText().length();i++){
                Soperando2 += displayString.charAt(i);
            }

            operando1= Double.parseDouble(Soperando1);
            operando2 = Double.parseDouble(Soperando2);

            switch (operatore){
                case '+' -> risultato = operando1 + operando2;
                case '-' -> risultato = operando1 - operando2;
                case '*' -> risultato = operando1 * operando2;
                case '/' -> risultato = operando1 / operando2;
                default -> risultato =0;
            }

            operandoInserito = false;
            displayText.setText(String.valueOf(risultato));

        }









    }

}
