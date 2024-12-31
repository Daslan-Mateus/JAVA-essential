package OO.figuras;

public class Triangulo extends  Figura2D {
    private double base;
    private double altura;

    public Triangulo(String nome, String cor, double base, double altura) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public void calcularArea() {
        double areaTriangulo = (base * altura) / 2;
        setArea(areaTriangulo);

    }

    @Override
    public String toString() {
        calcularArea();
        return super.toString();
    }
}
