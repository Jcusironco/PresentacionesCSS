module controlador.presentacionescss {
    requires javafx.controls;
    requires javafx.fxml;


    opens controlador to javafx.fxml;
    exports controlador;
}