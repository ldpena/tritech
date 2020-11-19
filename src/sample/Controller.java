package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button Adminportal;
    @FXML
    Button Clientportal;


    final String hostname = "172.26.54.42";
    final String instance = "CIS-3365*08";
    final String dbName = "Tri-Tech Informatics Database";
    final String port = "1433";
    final String username = "test2";
    final String password = "yes123";
    final String AWS_URL = "jdbc:sqlserver://" + hostname + "\\\\" + instance + ":" + port + ";database=" + dbName + ";user=" + username + ";password=" + password;

    public void changeScreenAdmin(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Adminlog.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();

    }
    public void changeScreenClient(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Clientlog.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
