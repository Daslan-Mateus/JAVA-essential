package collection.list;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListaOrdenada {

    public static void main(String[] args) {
        //    Dadas as seguintes informações sobre meus gatos, crie uma lista
//    e ordene esta lista exibindo: (nome - idade - cor);
//    Gato 1 = nome: Jon, idade: 18, cor: preto
//    Gato 2 = nome: Simba, idade: 6, cor: tigrado
//    Gato 3 = nome: Jon, idade: 12, cor: amarelo

        LinkedList<Gato> gatos = new LinkedList<>();
        gatos.add(new Gato("Jon", 18, "preto"));
        gatos.add(new Gato("Simba", 15, "azul"));
        gatos.add(new Gato("Amado", 50, "amarelo"));


        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(gatos);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("--\tOrdem Idade\t---");
        Comparator<Gato> caparatorByIdade = (g1, g2) -> Integer.compare(g1.getIdade(), g2.getIdade());
        gatos.sort(caparatorByIdade);
        System.out.println(gatos);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("--\tOrdem cor\t---");
        Comparator<Gato> caparatorByCor = (g1, g2) -> (g1.getCor().compareTo(g2.getCor()));
        gatos.sort(caparatorByCor);
        System.out.println(gatos);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        gatos.sort(Comparator.comparing(Gato::getNome)
                .thenComparing(Gato::getCor)
                .thenComparing(Gato::getIdade));
        System.out.println(gatos);
        System.out.println("---------------------------------------------");
        System.out.println();


    }


}
