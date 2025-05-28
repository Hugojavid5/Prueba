module org.hugo.dein.prueba {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hugo.dein.prueba to javafx.fxml;
    exports org.hugo.dein.prueba;
}