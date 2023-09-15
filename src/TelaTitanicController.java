import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class TelaTitanicController implements Initializable{

    @FXML
    private Button botao_analisar;

    @FXML
    private ComboBox<String> combo_opcoes;

    ObservableList<String> listaOpcoes = FXCollections.observableArrayList("Classe", "Classe e Genero", "Classe e Idade", "Genero",  "Genero e Idade", "Idade");

    @FXML
    void analisar(ActionEvent event) {
        UsuarioDados.classificacao = combo_opcoes.getValue();
    
        if(UsuarioDados.classificacao.equals("Classe"))
            App.change_scene("barraClasse");
        else if(UsuarioDados.classificacao.equals("Classe e Genero"))
            App.change_scene("barraClasseEGenero");
        else if(UsuarioDados.classificacao.equals("Classe e Idade")) 
            App.change_scene("barraClasseEIdade");
        else if(UsuarioDados.classificacao.equals("Genero"))
            App.change_scene("barraGenero");
        else if(UsuarioDados.classificacao.equals("Genero e Idade"))
            App.change_scene("barraGeneroEIdade");
        else if(UsuarioDados.classificacao.equals("Idade"))
            App.change_scene("barraIdade");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        combo_opcoes.setValue("Opções");
        combo_opcoes.setItems(listaOpcoes);
    }

}
