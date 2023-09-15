import java.io.Serializable;

public class Passageiro implements Serializable{
    private Integer viva;
    private Integer classe;
    private String nome;
    private String sexo;
    private Double idade;
    private Integer conjujesABordo;
    private Integer paisOuFilhosABordo;
    private Double tarifaPaga;

    public Passageiro(Integer viva, Integer classe, String nome, String sexo, Double idade, Integer conjujesABordo,
            Integer paisOuFilhosABordo, Double tarifaPaga) {
        this.viva = viva;
        this.classe = classe;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.conjujesABordo = conjujesABordo;
        this.paisOuFilhosABordo = paisOuFilhosABordo;
        this.tarifaPaga = tarifaPaga;
    }

    public Integer isViva() {
        return viva;
    }

    public void setViva(Integer viva) {
        this.viva = viva;
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public Integer getConjujesABordo() {
        return conjujesABordo;
    }

    public void setConjujesABordo(Integer conjujesABordo) {
        this.conjujesABordo = conjujesABordo;
    }

    public Integer getPaisOuFilhosABordo() {
        return paisOuFilhosABordo;
    }

    public void setPaisOuFilhosABordo(Integer paisOuFilhosABordo) {
        this.paisOuFilhosABordo = paisOuFilhosABordo;
    }

    public Double getTarifaPaga() {
        return tarifaPaga;
    }

    public void setTarifaPaga(Double tarifaPaga) {
        this.tarifaPaga = tarifaPaga;
    }

    @Override
    public String toString() {
        return "Passageiro [viva=" + viva + ", classe=" + classe + ", nome=" + nome + ", sexo=" + sexo + ", idade="
                + idade + ", conjujesABordo=" + conjujesABordo + ", paisOuFilhosABordo=" + paisOuFilhosABordo
                + ", tarifaPaga=" + tarifaPaga + "]";
    }
}
