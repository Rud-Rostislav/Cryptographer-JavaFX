module com.rrs.cryptographerfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.rrs.cryptographerfx to javafx.fxml;
    exports com.rrs.cryptographerfx;
}