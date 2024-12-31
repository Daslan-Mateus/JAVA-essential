package OO.figuras;

public abstract  class Figura2D extends  FiguraGeometrica implements  DimensaoSuperficial {
    private double area;

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return getNome() +
                "\n area: " + area;
    }

}
