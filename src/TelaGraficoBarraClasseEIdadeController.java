import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaGraficoBarraClasseEIdadeController implements Initializable{

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
    private Label label9;

    @FXML
    private Label label10;

    @FXML
    private Label label11;

    @FXML
    private Label label12;

    @FXML
    private BarChart grafico_barra;

    @FXML
    void voltarTelaInicial(ActionEvent event) {
        App.change_scene("tela inicial");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            Dados data = new Dados("Classe e Idade");

            XYChart.Series series1 = new XYChart.Series();
            series1.setName("Menores de 18");
            series1.getData().add(new XYChart.Data("Classe 1", Dados.pessoasZeroADezoitoAnosClasse1));
            series1.getData().add(new XYChart.Data("Classe 2", Dados.pessoasZeroADezoitoAnosClasse2));
            series1.getData().add(new XYChart.Data("Classe 3", Dados.pessoasZeroADezoitoAnosClasse3));

            XYChart.Series series2 = new XYChart.Series();
            series2.setName("Entre 19 a 30");
            series2.getData().add(new XYChart.Data("Classe 1", Dados.pessoasDezenoveATrintaAnosClasse1));
            series2.getData().add(new XYChart.Data("Classe 2", Dados.pessoasDezenoveATrintaAnosClasse2));
            series2.getData().add(new XYChart.Data("Classe 3", Dados.pessoasDezenoveATrintaAnosClasse3));

            XYChart.Series series3 = new XYChart.Series();
            series3.setName("Entre 31 a 50");
            series3.getData().add(new XYChart.Data("Classe 1", Dados.pessoasTrintaEUmACinquentaClasse1));
            series3.getData().add(new XYChart.Data("Classe 2", Dados.pessoasTrintaEUmACinquentaClasse2));
            series3.getData().add(new XYChart.Data("Classe 3", Dados.pessoasTrintaEUmACinquentaClasse3));

            XYChart.Series series4 = new XYChart.Series();
            series4.setName("Maiores de 50");
            series4.getData().add(new XYChart.Data("Classe 1", Dados.pessoasMaisCinquentaClasse1));
            series4.getData().add(new XYChart.Data("Classe 2", Dados.pessoasMaisCinquentaClasse2));
            series4.getData().add(new XYChart.Data("Classe 3", Dados.pessoasMaisCinquentaClasse3));

            label1.setText("Menores de 18 anos: " + Dados.pessoasZeroADezoitoAnosClasse1);
            label2.setText("Entre 19 a 30: " + Dados.pessoasDezenoveATrintaAnosClasse1);
            label3.setText("Entre 31 a 50: " + Dados.pessoasTrintaEUmACinquentaClasse1);
            label4.setText("Maiores de 50: " + Dados.pessoasMaisCinquentaClasse1);

            label5.setText("Menores de 18 anos: " + Dados.pessoasZeroADezoitoAnosClasse2);
            label6.setText("Entre 19 a 30: " + Dados.pessoasDezenoveATrintaAnosClasse2);
            label7.setText("Entre 31 a 50: " + Dados.pessoasTrintaEUmACinquentaClasse2);
            label8.setText("Maiores de 50: " + Dados.pessoasMaisCinquentaClasse2);

            label9.setText("Menores de 18 anos: " + Dados.pessoasZeroADezoitoAnosClasse3);
            label10.setText("Entre 19 a 30: " + Dados.pessoasDezenoveATrintaAnosClasse3);
            label11.setText("Entre 31 a 50: " + Dados.pessoasTrintaEUmACinquentaClasse3);
            label12.setText("Maiores de 50: " + Dados.pessoasMaisCinquentaClasse3);


            grafico_barra.getData().addAll(series1, series2, series3, series4);
    }

}
