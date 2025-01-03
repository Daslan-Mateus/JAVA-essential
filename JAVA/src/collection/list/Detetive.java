package collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Detetive {
    /*

    Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

    "Telefonou para a vítima?"
    "Esteve no local do crime?"
    "Mora perto da vítima?"
    "Devia para a vítima?"
    "Já trabalhou com a vítima?"

    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
    "Assassina". Caso contrário, ela será classificado como "Inocente".

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> respostasList = new ArrayList<>();
        String resposta;
        String[] questions = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            resposta = scan.next().toLowerCase();
            respostasList.add(resposta);
        }

        Iterator<String> iterator = respostasList.iterator();
        int contador = 0;
        while(iterator.hasNext()) {
            if (iterator.next().compareTo("sim") == 0) {
                contador += 1;
            }
        }

        switch (contador) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;

            case 4:
                System.out.println("Cúmplice");
                break;

            case 5:
                System.out.println("Assassina");
                break;

            default:
                System.out.println("Inocente");
        }



    }
}
