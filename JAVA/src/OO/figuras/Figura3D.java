package OO.figuras;

public abstract  class Figura3D extends  FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
    private double volume;
    private double area;

    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
                "\n volume: " + volume +
                "\n area: " + area;
    }
}
