import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaGraficoBarraEClasseEGeneroController implements Initializable{

    @FXML
    private Button botao_exibicao;

    @FXML
    private Button botao_voltar;

    @FXML
    private BarChart grafico_barra_classeEGenero;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    void voltarTelaInicial(ActionEvent event) {
        App.change_scene("tela inicial");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            Dados data = new Dados("Classe e Genero");

            XYChart.Series series1 = new XYChart.Series();
            series1.setName("Homens");
            series1.getData().add(new XYChart.Data("Classe 1", Dados.homensClasse1));
            series1.getData().add(new XYChart.Data("Classe 2", Dados.homensClasse2));
            series1.getData().add(new XYChart.Data("Classe 3", Dados.homensClasse3));

    
            XYChart.Series series2 = new XYChart.Series();
            series2.setName("Mulheres");
            series2.getData().add(new XYChart.Data("Classe 1", Dados.mulheresClasse1));
            series2.getData().add(new XYChart.Data("Classe 2", Dados.mulheresClasse2));
            series2.getData().add(new XYChart.Data("Classe 3", Dados.mulheresClasse3));

            label1.setText("Homens: " + Dados.homensClasse1);
            label2.setText("Mulheres: " + Dados.mulheresClasse1);

            label3.setText("Homens: " + Dados.homensClasse2);
            label4.setText("Mulheres: " + Dados.mulheresClasse2);
        
            label5.setText("Homens: " + Dados.homensClasse3);
            label6.setText("Mulheres: " + Dados.mulheresClasse3);

            grafico_barra_classeEGenero.getData().addAll(series1, series2);

    }

}