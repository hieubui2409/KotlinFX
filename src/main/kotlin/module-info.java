module com.lucasbui.kotlinfx {
    requires javafx.controls;
    requires javafx.graphics;
    requires tornadofx;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.lucasbui.kotlinfx;
    exports com.lucasbui.kotlinfx;
    exports com.lucasbui.kotlinfx.views;
    exports com.lucasbui.kotlinfx.controllers;
}