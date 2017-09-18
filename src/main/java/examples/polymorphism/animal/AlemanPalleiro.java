package examples.polymorphism.animal;

public class AlemanPalleiro extends Aleman {

    protected void waveTail() {
        System.out.println("Waving my tail... palleiro way");
    }

    public void detectarBomba() {
        System.out.println("Bomba.... palleiro way!");
    }

    public static void main(String[] args) {
        AlemanPalleiro rex2 = new AlemanPalleiro();
        rex2.waveTail();
        rex2.detectarBomba();
    }

    // Qué imprime waveTail?
    // normal
    // palleiro way

    // Y detectarBomba?
    // normal
    // palleiro way

    //
}
