module com.safefaces.safefaces {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.safefaces.safefaces to javafx.fxml;
    exports com.safefaces.safefaces;
    exports com.safefaces.safefaces.Model;
    opens com.safefaces.safefaces.Model to javafx.fxml;
    exports com.safefaces.safefaces.Controller;
    opens com.safefaces.safefaces.Controller to javafx.fxml;
    exports com.safefaces.safefaces.View;
    opens com.safefaces.safefaces.View to javafx.fxml;
    exports com.safefaces.safefaces.app;
    opens com.safefaces.safefaces.app to javafx.fxml;
}