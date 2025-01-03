package collection.set;

import java.util.*;

public class LinguagemFavoritaTest {
    public static void main(String[] args) {
//Crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
//    [X] Ordem de Inserção
//    [X] Ordem Natural (nome)
//    [X] IDE
//    Ano de criação e nome
//    Nome, ano de criacao e IDE
//    Ao final, exiba as linguagens no console, um abaixo da outra.

        System.out.println("Lista por ordem de Inserção");
        LinkedHashSet<LinguagemFavorita> linguahemOrdemInsercao = new LinkedHashSet<>(List.of(
                new LinguagemFavorita("intellij", 2005, "Java"),
                new LinguagemFavorita("pycharm", 2001, "Python"),
                new LinguagemFavorita("vs code", 1998, "JavaScript")
                ));
        System.out.println(linguahemOrdemInsercao);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Lista por ordem de Natural");
        TreeSet<LinguagemFavorita> linguagemOrdemNatural = new TreeSet<>(linguahemOrdemInsercao);
        System.out.println(linguagemOrdemNatural);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Lista por ordem de IDE");
        Comparator<LinguagemFavorita> comparator = Comparator.comparing(LinguagemFavorita::getide);
        TreeSet<LinguagemFavorita> linguagemFavoritasById = new TreeSet<>(comparator);
        Collections.addAll(linguagemFavoritasById, new LinguagemFavorita("intellij", 2005, "Java"),
                new LinguagemFavorita("pycharm", 2001, "Python"),
                new LinguagemFavorita("vs code", 1998, "JavaScript"));
        System.out.println(linguagemFavoritasById);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Lista por ano de criação e nome");
        Comparator<LinguagemFavorita> comparator1 = Comparator.comparing(LinguagemFavorita::getAnoDeCriacao).thenComparing(LinguagemFavorita::getNome);
        TreeSet<LinguagemFavorita> liguagemByAnoNome = new TreeSet<>(comparator1);
        Collections.addAll(liguagemByAnoNome, new LinguagemFavorita("intellij", 2005, "Java"),
                new LinguagemFavorita("pycharm", 2001, "Python"),
                new LinguagemFavorita("vs code", 1998, "JavaScript"));
        System.out.println(liguagemByAnoNome);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Lista por Nome, ano de criacao e IDE");
        Comparator<LinguagemFavorita> comparator2 = Comparator.comparing(LinguagemFavorita::getNome).thenComparing(LinguagemFavorita::getAnoDeCriacao).thenComparing(LinguagemFavorita::getide);
        Set<LinguagemFavorita> linguagemFavoritaNomeAnoIde = new TreeSet<>(comparator2);
        Collections.addAll(linguagemFavoritaNomeAnoIde, new LinguagemFavorita("intellij", 2005, "Java"),
                new LinguagemFavorita("pycharm", 2001, "Python"),
                new LinguagemFavorita("vs code", 1888, "TypeScript"));
        linguagemFavoritaNomeAnoIde.forEach(System.out::println);







    }
}
