import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaGraficoBarraGeneroEIdadeController implements Initializable{

    @FXML
    private Button botao_exibicao;

    @FXML
    private Button botao_voltar;

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
    private Label label7;

    @FXML
    private Label label8;

    @FXML
    private BarChart grafico_barra;

    @FXML
    void voltarTelaInicial(ActionEvent event) {
        App.change_scene("tela inicial");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Dados data = new Dados("Genero e Idade");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Menores de 18");
        series1.getData().add(new XYChart.Data("Homens", Dados.homensZeroADezoitoAnos));
        label1.setText("Menores de 18: " + Dados.homensZeroADezoitoAnos);
        series1.getData().add(new XYChart.Data("Mulheres", Dados.mulheresZeroADezoitoAnos));
        label5.setText("Menores de 18: " + Dados.mulheresZeroADezoitoAnos);


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Entre 19 a 30");
        series2.getData().add(new XYChart.Data("Homens", Dados.homensDezenoveATrintaAnos));
        label2.setText("Entre 19 a 30: " + Dados.homensDezenoveATrintaAnos);
        series2.getData().add(new XYChart.Data("Mulheres", Dados.mulheresDezenoveATrintaAnos));
        label6.setText("Entre 19 a 30: " + Dados.mulheresDezenoveATrintaAnos);

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Entre 31 a 50");
        series3.getData().add(new XYChart.Data("Homens", Dados.homensTrintaEUmACinquenta));
        label3.setText("Entre 31 a 50: " + Dados.homensTrintaEUmACinquenta);
        series3.getData().add(new XYChart.Data("Mulheres", Dados.mulheresTrintaEUmACinquenta));
        label7.setText("Entre 31 a 50: " + Dados.mulheresTrintaEUmACinquenta);

        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Maiores de 50");
        series4.getData().add(new XYChart.Data("Homens", Dados.homensMaisCinquenta));
        label4.setText("Maiores de 50: " + Dados.homensMaisCinquenta);
        series4.getData().add(new XYChart.Data("Mulheres", Dados.mulheresMaisCinquenta));
        label8.setText("Maiores de 50: " + Dados.mulheresMaisCinquenta);

        grafico_barra.getData().addAll(series1, series2, series3, series4);
    }
    
}
