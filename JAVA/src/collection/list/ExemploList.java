package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
//
//
//        System.out.println("Lista inicial:");
//        System.out.println(notas.toString());
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Adicione na lista a nota 8.0 na psoição 4: " );
//        notas.add(4, 8d);
//        System.out.println(notas);
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Substitua a nota 5 pela nota 8");
//        notas.set(notas.indexOf(5d), 8d);
//        System.out.println(notas);
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Exiba todas as notas na ordem que foram informadas:");
//        for (Double i : notas) {
//            System.out.println(i);
//        }

//        System.out.println("Exiba a soma dos valores");
//        Iterator<Double> interator = notas.iterator();
//        double soma = 0;
//        while (interator.hasNext()) {
//            soma += interator.next();
//        }
//        System.out.println(soma);
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Exiba a média das notas");
//        System.out.println(soma / notas.size());
//        System.out.println("---------------------------------------------");
//        System.out.println();

//        System.out.println("Remova a nota 0");
//        notas.remove(0d);
//        System.out.println(notas);
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Remova a posição 0");
//        notas.remove(0);
//        System.out.println(notas);
//        System.out.println("---------------------------------------------");
//        System.out.println();

//        System.out.println("Remova as notas menores que 7 e exiba a lista");
//        Iterator<Double> iterator = notas.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next() < 7) iterator.remove();
//        }
//        System.out.println(notas);
//        System.out.println("---------------------------------------------");
//        System.out.println();
//
//        System.out.println("Apague toda a lista");
//        notas.clear();
//        System.out.println(notas);
//        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2);
        System.out.println("---------------------------------------------");
        System.out.println();
//
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.getFirst() );
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        System.out.println(notas2.remove());





    }
}
