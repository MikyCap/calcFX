module com.decosmo.calcfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.capozzi.calcfx to javafx.fxml;
    exports com.capozzi.calcfx;
}