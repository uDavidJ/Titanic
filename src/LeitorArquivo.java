import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {
    
    public List<Passageiro> lerLista(String caminho) {
		String path = caminho;

        List<Passageiro> lista = new ArrayList<Passageiro>();
        
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
            line = br.readLine();

			while (line != null) {

                String[] vect = line.split(",");

                Passageiro p = new Passageiro(
                    Integer.parseInt(vect[0]),
                    Integer.parseInt(vect[1]),
                    vect[2],
                    vect[3],
                    Double.parseDouble(vect[4]),
                    Integer.parseInt(vect[5]),
                    Integer.parseInt(vect[6]),
                    Double.parseDouble(vect[7])
                );

                lista.add(p);

				line = br.readLine();
			}

		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

        return lista;
    }
}
