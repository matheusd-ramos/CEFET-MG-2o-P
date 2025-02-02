module com.principal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.principal to javafx.fxml;
    exports com.principal;
}
