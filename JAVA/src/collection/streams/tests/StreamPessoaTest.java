package collection.streams.tests;

import collection.streams.dominio.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPessoaTest {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        double mediaIdade = pessoas.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasil")).mapToInt(pessoa -> pessoa.getIdade()).average().getAsDouble();
        System.out.println(mediaIdade);



    }
}
