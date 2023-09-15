
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    private static Scene telaGraficoBarra;
    private static Scene telaGraficoBarraClasseEGenero;
    private static Scene telaGraficoBarraClasseEIdade;
    private static Scene telaInicial;
    private static Scene telaGraficoBarraGenero;
    private static Scene telaGraficoBarraGeneroEIdade;
    private static Scene telaGraficoBarraIdade;
    
    private static Stage stage; 

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("tela_titanic.fxml"));

        final FXMLLoader telaInicialXML = new FXMLLoader(getClass().getResource("tela_titanic.fxml"));
        telaInicial = new Scene(telaInicialXML.load());

        final FXMLLoader telaGraficoBarraXML = new FXMLLoader(getClass().getResource("tela_grafico_barra.fxml"));
        telaGraficoBarra = new Scene(telaGraficoBarraXML.load());

        final FXMLLoader telaGraficoBarraClasseEGeneroXML = new FXMLLoader(getClass().getResource("tela_grafico_barra_classeEgenero.fxml"));
        telaGraficoBarraClasseEGenero = new Scene(telaGraficoBarraClasseEGeneroXML.load());

        final FXMLLoader telaGraficoBarraClasseEIdadeXML = new FXMLLoader(getClass().getResource("tela_grafico_barra_classeEidade.fxml"));
        telaGraficoBarraClasseEIdade = new Scene(telaGraficoBarraClasseEIdadeXML.load());

        final FXMLLoader telaGraficoBarraGeneroXML = new FXMLLoader(getClass().getResource("tela_grafico_barra_genero.fxml"));
        telaGraficoBarraGenero = new Scene(telaGraficoBarraGeneroXML.load());

        final FXMLLoader telaGraficoBarraGeneroEIdadeXML = new FXMLLoader(getClass().getResource("tela_grafico_barra_generoEidade.fxml"));
        telaGraficoBarraGeneroEIdade = new Scene(telaGraficoBarraGeneroEIdadeXML.load());

        final FXMLLoader telaGraficoBarraIdadeXML = new FXMLLoader(getClass().getResource("tela_grafico_barra_idade.fxml"));
        telaGraficoBarraIdade = new Scene(telaGraficoBarraIdadeXML.load());

        primaryStage.setTitle("Mortes Titanic");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void change_scene(String codigo_tela){
        switch (codigo_tela){
            case "tela inicial":
                stage.setScene(telaInicial);
                break;
            case "barraClasse":
                stage.setScene(telaGraficoBarra);
                break;
            case "barraClasseEGenero":
                stage.setScene(telaGraficoBarraClasseEGenero);
                break;
            case "barraClasseEIdade":
                stage.setScene(telaGraficoBarraClasseEIdade);
                break;
            case "barraGenero":
                stage.setScene(telaGraficoBarraGenero);
                break;
            case "barraGeneroEIdade":
                stage.setScene(telaGraficoBarraGeneroEIdade);
                break;  
            case "barraIdade":
                stage.setScene(telaGraficoBarraIdade);
                break;   
        }
    }

}
