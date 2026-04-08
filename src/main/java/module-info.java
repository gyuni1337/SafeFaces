module com.safefaces.safefaces {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.safefaces.safefaces to javafx.fxml;
    exports com.safefaces.safefaces.Backend.Model;
    opens com.safefaces.safefaces.Backend.Model to javafx.fxml;
    exports com.safefaces.safefaces.Frontend.Controller;
    opens com.safefaces.safefaces.Frontend.Controller to javafx.fxml;
    exports com.safefaces.safefaces.Frontend.View;
    opens com.safefaces.safefaces.Frontend.View to javafx.fxml;
    exports com.safefaces.safefaces.Frontend.App;
    opens com.safefaces.safefaces.Frontend.App to javafx.fxml;
    exports com.safefaces.safefaces.Backend;
    opens com.safefaces.safefaces.Backend to javafx.fxml;
}