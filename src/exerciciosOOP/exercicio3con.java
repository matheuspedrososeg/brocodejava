package exerciciosOOP;

public class exercicio3con {

    double comprimento;

    double largura;

    exercicio3con(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public double getComprimento() {
        return comprimento;
    } public double getLargura() {
        return largura;
    } public double getArea() {
        return comprimento * largura;
    } public double getPerimetro() {
     return 2 * (comprimento * largura);
    }
}
