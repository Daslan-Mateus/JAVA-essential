package OO.figuras;

public class Cubo extends  Figura3D {
    private  int aresta;

    public Cubo(String nome, String cor, int aresta) {
        super(nome, cor);
        this.aresta = aresta;
    }

    @Override
    public void calcularArea() {
        setArea(Math.pow(aresta, 2));
    }

    @Override
    public void calcularVolume() {
        setVolume(Math.pow(aresta, 3));
    }

    @Override
    public String toString() {
        calcularArea();
        calcularVolume();
        return super.toString();
    }
}
