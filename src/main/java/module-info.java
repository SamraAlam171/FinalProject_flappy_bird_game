module com.example.demo13 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo13 to javafx.fxml;
    exports com.example.demo13;
}