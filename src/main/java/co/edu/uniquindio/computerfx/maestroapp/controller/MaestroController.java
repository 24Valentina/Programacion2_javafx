package co.edu.uniquindio.computerfx.maestroapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.computerfx.maestroapp.factory.ModelFactory;
import co.edu.uniquindio.computerfx.maestroapp.model.Maestro;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MaestroController {
    ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private RadioButton rButtonReligioso;

    @FXML
    private TextField txtCelular;

    @FXML
    private RadioButton rButtonSecundaria;

    @FXML
    private RadioButton rButtonPrimaria;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEmail;

    @FXML
    private Button btnAgregarMaestro;

    @FXML
    private TextField txtCedula;

    @FXML
    private ToggleGroup maestro;

    @FXML
    private TextField txtMateriaAsignada;

    @FXML
    void onAgregarMaestro(ActionEvent event) {
        agregarMaestro();
    }

    @FXML
    void initialize() {
       modelFactory = ModelFactory.getInstancia();
    }

    private void agregarMaestro() {
        Maestro maestro = new Maestro();
        maestro.setNombre(txtNombre.getText());
        maestro.setCedula(txtCedula.getText());
        maestro.setEdad(Integer.parseInt(txtEdad.getText()));
        maestro.setEmail(txtEmail.getText());
        maestro.setCelular((txtCelular.getText()));
        maestro.setMateriaAsignada(txtMateriaAsignada.getText());

        if (rButtonPrimaria.isSelected()){
            txtResultado.setText(maestro.imprimirMaestroPrimaria());
        } else if (rButtonSecundaria.isSelected()) {
            txtResultado.setText(maestro.imprimirMaestroSecundaria());
        } else if (rButtonReligioso.isSelected()) {
            txtResultado.setText(maestro.imprimirMaestro());
        }
    }
}
