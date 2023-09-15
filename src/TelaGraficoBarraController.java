import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaGraficoBarraController implements Initializable{

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
    private Label label3;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {



        // XYChart.Series series1 = new XYChart.Series();

        // series1.setName("abc");
        // series1.getData().add(new XYChart.Data("teste1", 2139));
        // series1.getData().add(new XYChart.Data("teste2", 3542));
        // series1.getData().add(new XYChart.Data("teste3", 1231));
        // series1.getData().add(new XYChart.Data("teste4", 5315));
        // series1.getData().add(new XYChart.Data("teste5", 7421));
        // series1.getData().add(new XYChart.Data("teste6", 7236));

        // XYChart.Series series2 = new XYChart.Series();

        // series2.setName("def");
        // series2.getData().add(new XYChart.Data("teste1", 2139));
        // series2.getData().add(new XYChart.Data("teste2", 3542));
        // series2.getData().add(new XYChart.Data("teste3", 1231));
        // series2.getData().add(new XYChart.Data("teste4", 5315));
        // series2.getData().add(new XYChart.Data("teste5", 7421));
        // series2.getData().add(new XYChart.Data("teste6", 7236));

        // XYChart.Series series3 = new XYChart.Series();
    
        // series3.setName("ghi");
        // series3.getData().add(new XYChart.Data("teste1", 2139));
        // series3.getData().add(new XYChart.Data("teste2", 3542));
        // series3.getData().add(new XYChart.Data("teste3", 1231));
        // series3.getData().add(new XYChart.Data("teste4", 5315));
        // series3.getData().add(new XYChart.Data("teste5", 7421));
        // series3.getData().add(new XYChart.Data("teste6", 7236));

        // grafico_barra.getData().addAll(series1, series2, series3);

            Dados data = new Dados("Classe");
            XYChart.Series series1 = new XYChart.Series();
            series1.setName("Classe 1");
            series1.getData().add(new XYChart.Data(" ", Dados.pessoasMortasClasse1));
            
            XYChart.Series series2 = new XYChart.Series();
            series2.setName("Classe 2");
            series2.getData().add(new XYChart.Data(" ", Dados.pessoasMortasClasse2));

            XYChart.Series series3 = new XYChart.Series();
            series3.setName("Classe 3");
            series3.getData().add(new XYChart.Data(" ", Dados.pessoasMortasClasse3));

            label1.setText("Classe 1: " + Dados.pessoasMortasClasse1);
            label2.setText("Classe 2: " + Dados.pessoasMortasClasse2);
            label3.setText("Classe 3: " + Dados.pessoasMortasClasse3);

            grafico_barra.getData().addAll(series1, series2, series3);

    }

    @FXML
    void voltarTelaInicial(ActionEvent event) {
        //grafico_barra.getData().clear();
        App.change_scene("tela inicial");
    }

}
