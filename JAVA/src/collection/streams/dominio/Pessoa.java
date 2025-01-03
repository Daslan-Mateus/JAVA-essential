package collection.streams.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {
    String id;
    String nome;
    String nacionalidade;
    int idade;
    //gets e sets omitidos

    public Pessoa(){}

    public Pessoa (String id, String nome, String nacionalidade, int idade){
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Pessoa> populaPessoas(){
        Pessoa pessoa1 = new Pessoa("p1" , "Matheus Henrique", "Brasil", 25);
        Pessoa pessoa2 = new Pessoa("p2" , "Hernandez Roja", "Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3" , "Mario Fernandes","Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4" , "Neymar Junior", "Brasil", 18);
        Pessoa pessoa5 = new Pessoa("p5" , "Adilson", "Brasil", 22);



        List<Pessoa> list = new ArrayList<Pessoa>();
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        list.add(pessoa5);
        return list;
    }

    @Override  public String toString() { return this.nome; }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idade);
    }
}