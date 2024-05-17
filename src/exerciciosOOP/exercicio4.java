package exerciciosOOP;

public class exercicio4 {
    public static void main(String[] args) {

        exercicio4con circulo1 = new exercicio4con(3);

        System.out.println("A área do circulo é: " + circulo1.getArea());
        System.out.println("A circunferência do círculo é: " +  circulo1.getCircunferencia());

        circulo1.setRaio(8);

        System.out.println("A nova área do circulo é: " + circulo1.getArea());
        System.out.println("A nvoa circunferência do circulo é: " + circulo1.getCircunferencia());
    }
}
