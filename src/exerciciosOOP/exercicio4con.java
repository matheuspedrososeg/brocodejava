package exerciciosOOP;

public class exercicio4con {

    double pi = 3.14;

    double raio;

    exercicio4con(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getArea() {
        return pi * Math.pow(raio, 2);
    }
    public double getCircunferencia() {
        return 2 * pi * raio;
    }
}
