package OOP.passarOBJ;

public class OBJpassing {

    public static void main(String[] args) {

        OBJpassing garagem = new OBJpassing();

        carOBJpassing carro = new carOBJpassing("Chevette");
        carOBJpassing carro2 = new carOBJpassing("Fusca");

        garagemOBJpassing.park(carro);
        garagemOBJpassing.park(carro2);

    }
}
