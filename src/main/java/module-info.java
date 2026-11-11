module ni.edu.uam.persistenciadatoshibernate {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ni.edu.uam.persistenciadatoshibernate to javafx.fxml;
    exports ni.edu.uam.persistenciadatoshibernate;
}