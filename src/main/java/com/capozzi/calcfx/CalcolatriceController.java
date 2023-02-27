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

    boolean operandoInserito = true;

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
        operandoInserito = false;


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
        operandoInserito = false;

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
        operandoInserito = false;

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

        operandoInserito = false;

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

        operandoInserito = false;

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

        operandoInserito = false;

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

        operandoInserito = false;

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

        operandoInserito = false;

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

        operandoInserito = false;

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

        ProcessBuilder pb = new ProcessBuilder("src/main/resources/work.cmd");
        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    protected void onpiuButtonClick() {
        if (flagUguale) {
            displayText.setText("");
            flagUguale = false;
        }

        if (operandoInserito){
            displayText.setText(displayText.getText());
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
        }else{
            displayString = displayText.getText();
            displayString = displayString + "/";
            displayText.setText(displayString);
            operandoInserito = true;
        }
    }

    private double operazione(double op1, double op2, char operando){

        double risultato;

        switch (operando){
            case '+' -> risultato = op1+op2;
            case '-' -> risultato = op1-op2;
            case '*' -> risultato = op1*op2;
            case '/' -> risultato = op1/op2;


            default -> risultato = -1;
        }

        return risultato;
    }

    @FXML
    protected void onUgualeButtonClick(){

        boolean trovato = false;

        double risultato;
        double operando1,operando2;
        String Soperando1 = "",Soperando2 = "";
        char operatore;
        int i,j;





    }

}
