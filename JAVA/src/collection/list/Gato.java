package collection.list;

public class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int compareTo(Gato gatinho) {
        return this.nome.compareTo(gatinho.getNome());
    }

    @Override
    public String toString() {
        return "\n Gatos {" +
                "nome: " + nome +
                " idade: " + idade +
                " cor: " + cor + '}' +
                '\n' ;
    }
}
