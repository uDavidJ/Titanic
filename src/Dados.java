import java.util.List;

public class Dados {
    /*Aqui se encontram todos os dados necessários para a execucao do programa atraves da leitura do 
     * arquivo CSV.
     */

    private static Integer pessoasClasse1;
    private static Integer pessoasClasse2;
    private static Integer pessoasClasse3;
    
    public static Integer pessoasMortasClasse1 = 0;
    public static Integer pessoasMortasClasse2 = 0;
    public static Integer pessoasMortasClasse3 = 0;

    public static Integer homens = 0;
    public static Integer mulheres = 0;

    public static Integer homensClasse1 = 0;
    public static Integer homensClasse2 = 0;
    public static Integer homensClasse3 = 0;
    public static Integer mulheresClasse1 = 0;
    public static Integer mulheresClasse2 = 0;
    public static Integer mulheresClasse3 = 0;

    public static Integer pessoasZeroADezoitoAnosClasse1 = 0;
    public static Integer pessoasDezenoveATrintaAnosClasse1 = 0;
    public static Integer pessoasTrintaEUmACinquentaClasse1 = 0;
    public static Integer pessoasMaisCinquentaClasse1 = 0;

    public static Integer pessoasZeroADezoitoAnosClasse2 = 0;
    public static Integer pessoasDezenoveATrintaAnosClasse2 = 0;
    public static Integer pessoasTrintaEUmACinquentaClasse2 = 0;
    public static Integer pessoasMaisCinquentaClasse2 = 0;

    public static Integer pessoasZeroADezoitoAnosClasse3 = 0;
    public static Integer pessoasDezenoveATrintaAnosClasse3 = 0;
    public static Integer pessoasTrintaEUmACinquentaClasse3 = 0;
    public static Integer pessoasMaisCinquentaClasse3 = 0;
    
    public static Integer homensZeroADezoitoAnos = 0;
    public static Integer homensDezenoveATrintaAnos = 0;
    public static Integer homensTrintaEUmACinquenta = 0;
    public static Integer homensMaisCinquenta = 0;

    public static Integer mulheresZeroADezoitoAnos = 0;
    public static Integer mulheresDezenoveATrintaAnos = 0;
    public static Integer mulheresTrintaEUmACinquenta = 0;
    public static Integer mulheresMaisCinquenta = 0;

    public static Integer pessoasZeroADezoitoAnos = 0;
    public static Integer pessoasDezenoveATrintaAnos = 0;
    public static Integer pessoasTrintaEUmACinquenta = 0;
    public static Integer pessoasMaisCinquenta = 0;

    public Dados(String classificacao) {
        List<Passageiro> lista = abreArquivo("C:\\Users\\Kelli\\Desktop\\Titanic\\Arquivos\\titanic.csv");

        if(classificacao.equals("Classe")) {
            for(Passageiro p : lista) {
                if(p.getClasse() == 1 && p.isViva() == 0)
                    Dados.pessoasMortasClasse1++;
                else if(p.getClasse() == 2 && p.isViva() == 0)
                    Dados.pessoasMortasClasse2++;
                else if(p.getClasse() == 3 && p.isViva() == 0)
                    Dados.pessoasMortasClasse3++;
            }
        } else if(classificacao.equals("Classe e Genero")) {
            
            for(Passageiro p : lista) {
                if(p.getClasse() == 1 && p.getSexo().equals("male") && p.isViva() == 0) 
                    Dados.homensClasse1++;
                else if(p.getClasse() == 2 && p.getSexo().equals("male") && p.isViva() == 0) 
                    Dados.homensClasse2++;
                else if(p.getClasse() == 3 && p.getSexo().equals("male") && p.isViva() == 0) 
                    Dados.homensClasse3++;
                else if(p.getClasse() == 1 && p.getSexo().equals("female") && p.isViva() == 0) 
                    Dados.mulheresClasse1++;
                else if(p.getClasse() == 3 && p.getSexo().equals("female") && p.isViva() == 0) 
                    Dados.mulheresClasse2++;
                else if(p.getClasse() == 3 && p.getSexo().equals("female") && p.isViva() == 0) 
                    Dados.mulheresClasse3++;
                }

        }else if(classificacao.equals("Classe e Idade")) {
            
            for(Passageiro p : lista) {
                if(p.getClasse() == 1 && p.getIdade() <= 18 && p.isViva() == 0)
                    pessoasZeroADezoitoAnosClasse1++;
                else if(p.getClasse() == 1 && p.getIdade() > 18 && p.getIdade() <= 30 && p.isViva() == 0)
                    pessoasDezenoveATrintaAnosClasse1++;
                else if(p.getClasse() == 1 && p.getIdade() > 30 && p.getIdade() <= 50 && p.isViva() == 0)
                    pessoasTrintaEUmACinquentaClasse1++;
                else if(p.getClasse() == 1 && p.getIdade() > 50 && p.isViva() == 0)
                    pessoasMaisCinquentaClasse1++;
                else if(p.getClasse() == 2 && p.getIdade() <= 18 && p.isViva() == 0)
                    pessoasZeroADezoitoAnosClasse2++;
                else if(p.getClasse() == 2 && p.getIdade() > 18 && p.getIdade() <= 30 && p.isViva() == 0)
                    pessoasDezenoveATrintaAnosClasse2++;
                else if(p.getClasse() == 2 && p.getIdade() > 30 && p.getIdade() <= 50 && p.isViva() == 0)
                    pessoasTrintaEUmACinquentaClasse2++;
                else if(p.getClasse() == 2 && p.getIdade() > 50 && p.isViva() == 0)
                    pessoasMaisCinquentaClasse2++;
                else if(p.getClasse() == 3 && p.getIdade() <= 18 && p.isViva() == 0)
                    pessoasZeroADezoitoAnosClasse3++;
                else if(p.getClasse() == 3 && p.getIdade() > 18 && p.getIdade() <= 30 && p.isViva() == 0)
                    pessoasDezenoveATrintaAnosClasse3++;
                else if(p.getClasse() == 3 && p.getIdade() > 30 && p.getIdade() <= 50 && p.isViva() == 0)
                    pessoasTrintaEUmACinquentaClasse3++;
                else if(p.getClasse() == 3 && p.getIdade() > 50 && p.isViva() == 0)
                    pessoasMaisCinquentaClasse3++;
                
            }
        }else if(classificacao.equals("Genero")) {

            for(Passageiro p : lista) {
                if(p.getSexo().equals("male") && p.isViva() == 0)
                    Dados.homens++;
                else if(p.getSexo().equals("female") && p.isViva() == 0)
                    Dados.mulheres++;
            }
        }else if(classificacao.equals("Genero e Idade")) {
            for(Passageiro p : lista) {
                if(p.getSexo().equals("male") && p.getIdade() <= 18 && p.isViva() == 0)
                    homensZeroADezoitoAnos++;
                else if(p.getSexo().equals("male") && p.getIdade() > 18 && p.getIdade() <= 30 && p.isViva() == 0)
                    homensDezenoveATrintaAnos++;
                else if(p.getSexo().equals("male") && p.getIdade() > 30 && p.getIdade() <= 50 && p.isViva() == 0)
                    homensTrintaEUmACinquenta++;
                else if(p.getSexo().equals("male") && p.getIdade() > 50 && p.isViva() == 0)
                    homensMaisCinquenta++;
                else if(p.getSexo().equals("female") && p.getIdade() <= 18 && p.isViva() == 0)
                    mulheresZeroADezoitoAnos++;
                else if(p.getSexo().equals("female") && p.getIdade() > 18 && p.getIdade() <= 30 && p.isViva() == 0)
                    mulheresDezenoveATrintaAnos++;
                else if(p.getSexo().equals("female") && p.getIdade() > 30 && p.getIdade() <= 50 && p.isViva() == 0)
                    mulheresTrintaEUmACinquenta++;
                else if(p.getSexo().equals("female") && p.getIdade() > 50 && p.isViva() == 0)
                    mulheresMaisCinquenta++;

            }
        }else if(classificacao.equals("Idade")) {
            for(Passageiro p : lista) {
                if(p.getIdade() <= 18 && p.isViva() == 0) 
                    pessoasZeroADezoitoAnos++;
                else if(p.getIdade() > 18 && p.getIdade() <= 30 && p.isViva() == 0)
                    pessoasDezenoveATrintaAnos++;
                else if(p.getIdade() > 30 && p.getIdade() <= 50 && p.isViva() == 0)
                    pessoasTrintaEUmACinquenta++;
                else if(p.getIdade() > 50 && p.isViva() == 0)
                    pessoasMaisCinquenta++;
            }
        }
    }


    public List<Passageiro> abreArquivo(String caminho) {
        LeitorArquivo la = new LeitorArquivo();
        return la.lerLista(caminho);
    }


    public Integer getPessoasClasse1() {
        return pessoasClasse1;
    }


    public Integer getPessoasClasse2() {
        return pessoasClasse2;
    }


    public Integer getPessoasClasse3() {
        return pessoasClasse3;
    }


    public Integer getPessoasMortasClasse1() {
        return pessoasMortasClasse1;
    }


    public Integer getPessoasMortasClasse2() {
        return pessoasMortasClasse2;
    }


    public Integer getPessoasMortasClasse3() {
        return pessoasMortasClasse3;
    }

    public Integer getHomens() {
        return homens;
    }


    public Integer getMulheres() {
        return mulheres;
    }


    public Integer getHomensClasse1() {
        return homensClasse1;
    }


    public Integer getHomensClasse2() {
        return homensClasse2;
    }


    public Integer getHomensClasse3() {
        return homensClasse3;
    }


    public Integer getMulheresClasse1() {
        return mulheresClasse1;
    }


    public Integer getMulheresClasse2() {
        return mulheresClasse2;
    }


    public Integer getMulheresClasse3() {
        return mulheresClasse3;
    }


    public Integer getPessoasZeroADezoitoAnos() {
        return pessoasZeroADezoitoAnos;
    }


    public Integer getPessoasDezenoveATrintaAnos() {
        return pessoasDezenoveATrintaAnos;
    }


    public Integer getPessoasTrintaEUmACinquenta() {
        return pessoasTrintaEUmACinquenta;
    }


    public Integer getPessoasMaisCinquenta() {
        return pessoasMaisCinquenta;
    }


    public Integer getHomensZeroADezoitoAnos() {
        return homensZeroADezoitoAnos;
    }


    public Integer getHomensDezenoveATrintaAnos() {
        return homensDezenoveATrintaAnos;
    }


    public Integer getHomensTrintaEUmACinquenta() {
        return homensTrintaEUmACinquenta;
    }


    public Integer getHomensMaisCinquenta() {
        return homensMaisCinquenta;
    }


    public Integer getMulheresZeroADezoitoAnos() {
        return mulheresZeroADezoitoAnos;
    }


    public Integer getMulheresDezenoveATrintaAnos() {
        return mulheresDezenoveATrintaAnos;
    }


    public Integer getMulheresTrintaEUmACinquenta() {
        return mulheresTrintaEUmACinquenta;
    }


    public Integer getMulheresMaisCinquenta() {
        return mulheresMaisCinquenta;
    }

    
}
