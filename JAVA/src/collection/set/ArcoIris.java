package collection.set;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {

//        Crie um conjunto contendo as cores do arco-íris e:
        HashSet<String> arco_iris = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "anil", "violeta"));
        System.out.println(arco_iris);
        System.out.println("---------------------------------------------");
        System.out.println();

//        Exiba todas as cores uma abaixo da outra
        for (String cor : arco_iris) {
            System.out.println(cor);
        }
        System.out.println("---------------------------------------------");
        System.out.println();

//        A quantidade de cores que o arco-íris tem:
        System.out.println("O arco-iris tem: " + arco_iris.size() + " cores.");
        System.out.println("---------------------------------------------");
        System.out.println();

//        Exiba as cores em ordem alfabética
        System.out.println("Lista em ordem alfabética");
        TreeSet<String> arcoIrisTree = new TreeSet<>();
        Collections.addAll(arcoIrisTree, "vermelha", "laranja", "amarela", "verde", "azul", "anil", "violeta");
        System.out.println(arcoIrisTree);
        System.out.println("---------------------------------------------");
        System.out.println();

//        Exiba as cores na ordem inversa da que foi informada
        System.out.println("Lista em ordem inversa");
        ArrayList<String> arcoInverso = new ArrayList<>(arcoIrisTree);
        Collections.reverse(arcoInverso);
        System.out.println(arcoInverso);
        System.out.println("---------------------------------------------");
        System.out.println();

//        Exiba todas as cores que começam com a letra ”v”
        System.out.println("Cores que começam com a letra 'v' ");
        for (String cor : arcoIrisTree) {
            if (cor.toLowerCase().charAt(0) == 'v') {
                System.out.println(cor);
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println();

//        Remova todas as cores que não começam com a letra “v”
        System.out.println("Lista com cores que começam com a letra 'v' ");
        Iterator<String> iterator = arcoIrisTree.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().charAt(0) != 'v') {
                iterator.remove();
            }
        }
        System.out.println(arcoIrisTree);
        System.out.println("---------------------------------------------");
        System.out.println();

//        Limpe o conjunto
        arcoIrisTree.clear();
//        Confira se o conjunto está vazio
        System.out.println("Lista vazia: " + arcoIrisTree.isEmpty());


    }
}
