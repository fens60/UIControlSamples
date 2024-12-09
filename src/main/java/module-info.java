module ies.losmontecillos.uicontrolsample {
    requires javafx.controls;
    requires javafx.fxml;


    opens ies.losmontecillos.uicontrolsample to javafx.fxml;
    exports ies.losmontecillos.uicontrolsample;
}