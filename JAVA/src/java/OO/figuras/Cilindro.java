package java.OO.figuras;

public class Cilindro extends  Figura3D {
    private double raio;
    private double haltura;

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.haltura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getHaltura() {
        return haltura;
    }

    public void setHaltura(double haltura) {
        this.haltura = haltura;
    }

    @Override
    public void calcularArea() {
        double areaCilindro = (2 * Math.PI * Math.pow(raio, 2)) + (2 * Math.PI * raio * haltura);
        setArea(areaCilindro);

    }

    @Override
    public void calcularVolume() {
        double volumeCilindro = Math.PI * Math.pow(raio, 2) * haltura;
        setVolume(volumeCilindro);
    }

    @Override
    public String toString() {
        calcularArea();
        calcularVolume();
        return super.toString();
    }
}
