import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaGraficoBarraGeneroController implements Initializable{

    @FXML
    private Button botao_exibicao;

    @FXML
    private Button botao_voltar;

    @FXML
    private BarChart grafico_barra;

    @FXML
    private Label label1;

    @FXML
    private Label label2;


    @FXML
    void voltarTelaInicial(ActionEvent event) {
        App.change_scene("tela inicial");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Dados data = new Dados("Genero");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Homens");
        series1.getData().add(new XYChart.Data(" ", Dados.homens));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Mulheres");
        series2.getData().add(new XYChart.Data(" ", Dados.mulheres));

        label1.setText("Homens: " + Dados.homens);
        label2.setText("Mulheres: " + Dados.mulheres);

        grafico_barra.getData().addAll(series1, series2);
    }
}
