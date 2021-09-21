module com.coderpwh.craft_compiler {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.coderpwh.craft_compiler to javafx.fxml;
    exports com.coderpwh.craft_compiler;
}