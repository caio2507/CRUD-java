package model;

public class Aluno {
    private String nome ;
    private String objetivo ;

    public Aluno(String nome, String objetivo) {
        this.nome = nome;
        this.objetivo = objetivo;
    }
    public void exibirInfo(){
        System.out.println("NOME: " + this.nome + "| OBJETIVO: " + this.objetivo);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' +
                ", objetivo='" + objetivo + '\'' +
                '}';
    }
}
