package examples.polymorphism.animal;

public class Aleman extends Dog {

    public void detectarBomba() {
        System.out.println("Bomba!");
    }

    public static void main(String[] args) {
        Aleman rex = new Aleman();
        rex.waveTail();
        rex.detectarBomba();
    }
}
