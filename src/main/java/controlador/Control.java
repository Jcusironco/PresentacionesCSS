package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Control implements Initializable {
    @FXML
    private Pane idPanel;

    @FXML
    private ImageView imag1;
    @FXML
    private ImageView imag2;

    @FXML
    private ImageView imag3;

    @FXML
    private ImageView imag4;

    @FXML
    private ImageView imag5;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnalegre;

    @FXML
    private Button btnpensativo;

    @FXML
    private Button btnreset;

    @FXML
    private Button btntriste;
    @FXML
    public void onalegre(ActionEvent event) {
        idPanel.getStylesheets().clear();
        idPanel.getStylesheets().add(getClass().getResource("/controlador/CSS/alegre.css").toExternalForm());

    }
    @FXML
    public void onpensativo(ActionEvent event) {
        idPanel.getStylesheets().clear();
        idPanel.getStylesheets().add(getClass().getResource("/controlador/CSS/pensativo.css").toExternalForm());
    }
    @FXML
    public void onreset(ActionEvent event) {
        idPanel.getStylesheets().clear();
        idPanel.getStylesheets().add(getClass().getResource("/controlador/CSS/base.css").toExternalForm());
    }
    @FXML
    public void onsalir(ActionEvent event) {
        System.exit(0);

    }
    @FXML
    public void ontriste(ActionEvent event) {
        idPanel.getStylesheets().clear();
        idPanel.getStylesheets().add(getClass().getResource("/controlador/CSS/triste.css").toExternalForm());

    }
    @FXML
    void showImage1(MouseEvent event) {
        imag1.setVisible(true);
    }
    @FXML
    void showImage2(MouseEvent event) {
        imag2.setVisible(true);;
    }
    @FXML
    void showImage3(MouseEvent event) {
        imag3.setVisible(true);;
    }
    @FXML
    void showImage4(MouseEvent event) {
        imag4.setVisible(true);;
    }
    @FXML
    void showImage5(MouseEvent event) {
        imag5.setVisible(true);;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}