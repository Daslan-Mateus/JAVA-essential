package java.OO.figuras;

public class Quadrado extends Figura2D  {
    private double altura;
    private double comprimento;

    public Quadrado(String nome, String cor, double altura, double comprimento) {
        super(nome, cor);
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {
        double areaQuadrado = comprimento * altura;
        setArea(areaQuadrado);
    }

    @Override
    public String toString() {
        calcularArea();
        return super.toString();
    }


}
