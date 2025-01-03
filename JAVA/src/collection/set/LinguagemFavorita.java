package collection.set;

import java.util.Comparator;

public class LinguagemFavorita implements  Comparable<LinguagemFavorita>, Comparator {
//    Crie uma classe LinguagemFavorita que possua os atributos: nome, anoDeCriacao e idee.
    private String ide;
    private String nome;
    private int getAnoDeCriacao;

    public LinguagemFavorita(String ide, int getAnoDeCriacao, String nome) {
        this.ide = ide;
        this.getAnoDeCriacao = getAnoDeCriacao;
        this.nome = nome;
    }

    public String getide() {
        return ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return getAnoDeCriacao;
    }

    @Override
    public String toString() {
        return "{" +
                "ide: " + ide +
                ", nome: '" + nome + '\'' +
                ", anoDeCriação: " + getAnoDeCriacao +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
