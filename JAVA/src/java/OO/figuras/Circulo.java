package java.OO.figuras;

public class Circulo extends  Figura2D {
    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double areaCirculo = Math.PI * raio;
        setArea(areaCirculo);
    }

    @Override
    public String toString() {
        calcularArea();
        return super.toString();
    }

}
