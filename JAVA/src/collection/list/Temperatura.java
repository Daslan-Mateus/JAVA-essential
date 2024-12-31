package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

    /*
    Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
    mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
     */

    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        ArrayList<Double> temperatura = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Digite a temperatura de " +  meses[i] );
            double temp = scan.nextInt();
            temperatura.add((double) temp);
        }

        Iterator<Double> iterator = temperatura.iterator();
        double soma = 0;
        double media = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
            media = soma / temperatura.size();
        }
        System.out.println("Lista de temperaturas");
        System.out.println(temperatura);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Média de temperaturas");
        System.out.println(media);
        System.out.println("---------------------------------------------");
        System.out.println();

        System.out.println("Temperaturas acima da média");
        for (Double i : temperatura) {
            if (i > media) System.out.println(i);
        }

//

    }
}
