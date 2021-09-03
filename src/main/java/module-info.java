module com.section3.classmanagement {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome;
    requires java.sql;


    opens com.section3.classmanagement to javafx.fxml;
    exports com.section3.classmanagement;
}