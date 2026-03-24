module com.safefaces.safefaces {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.safefaces.safefaces to javafx.fxml;
    exports com.safefaces.safefaces;
}