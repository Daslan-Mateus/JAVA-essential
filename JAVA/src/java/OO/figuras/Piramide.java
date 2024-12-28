package java.OO.figuras;

public class Piramide extends  Figura3D {
    public Piramide(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public void calcularArea() {
        System.out.println("calculando area da piramide");

    }
    @Override
    public void calcularVolume() {
        System.out.println("calculando volume da piramide");

    }

    @Override
    public String toString() {
        calcularArea();
        calcularVolume();
        return super.toString();
    }
}
