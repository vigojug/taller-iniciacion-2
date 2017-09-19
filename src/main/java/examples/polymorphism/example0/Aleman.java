package examples.polymorphism.example0;

public class Aleman extends Perro {

    public void detectarBomba() {
        System.out.println("Bomba!");
    }

    public static void main(String[] args) {
        Aleman rex = new Aleman();
        rex.waveTail();
        rex.detectarBomba();
    }
}
