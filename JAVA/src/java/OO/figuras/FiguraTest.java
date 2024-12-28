package java.OO.figuras;

public class FiguraTest {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Quadrado", "verde", 2, 2);
        Triangulo triangulo = new Triangulo("Triangulo", "Azul", 2, 10);
        Circulo circulo = new Circulo("Circulo", "vermelho", 5);


        Cilindro cilindro = new Cilindro("Cilindro", "verde", 5, 10);
        Piramide piramide = new Piramide("Piramide", "amarelo");
        Cubo cubo = new Cubo("Cubo", "branco", 4);

        FiguraGeometrica[] arrayFifuras = {quadrado, triangulo, circulo, cilindro, piramide,cubo};
        for (FiguraGeometrica i : arrayFifuras) {
            System.out.println(i);
            System.out.println("------------------------------------------------");
            System.out.println();
        }


    }
}
