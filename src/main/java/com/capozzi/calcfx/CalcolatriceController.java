package com.capozzi.calcfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcolatriceController {
    @FXML
    private Label displayText;

    @FXML
    private String displayString;
    @FXML
    private boolean flagUguale;

    @FXML
    protected void onPointButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + ".";
        displayText.setText(displayString);
    }

    @FXML
    protected void on0ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 0;
        displayText.setText(displayString);
    }

    @FXML
    protected void on1ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 1;
        displayText.setText(displayString);
    }

    @FXML
    protected void on2ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 2;
        displayText.setText(displayString);
    }

    @FXML
    protected void on3ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 3;
        displayText.setText(displayString);
    }

    @FXML
    protected void on4ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 4;
        displayText.setText(displayString);
    }

    @FXML
    protected void on5ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 5;
        displayText.setText(displayString);
    }

    @FXML
    protected void on6ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 6;
        displayText.setText(displayString);

    }

    @FXML
    protected void on7ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 7;
        displayText.setText(displayString);
    }

    @FXML
    protected void on8ButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + 8;
        displayText.setText(displayString);
    }

    @FXML
    protected void on9ButtonClick() {
        if (flagUguale == true) {
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
    }

    @FXML
    protected void onpiuButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + "+";
        displayText.setText(displayString);
    }

    @FXML
    protected void onMenoButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + "-";
        displayText.setText(displayString);
    }

    @FXML
    protected void onPerButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + "*";
        displayText.setText(displayString);
    }

    @FXML
    protected void onDivButtonClick() {
        if (flagUguale == true) {
            displayText.setText("");
            flagUguale = false;
        }
        displayString = displayText.getText();
        displayString = displayString + "/";
        displayText.setText(displayString);
    }


}
