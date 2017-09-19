package examples.polymorphism.puzzlers1;

public class Poly2 {

    void method(int... a) {
        System.out.println(1);
    }

    // Este método:
    // No compila.
    // Error de runtime
    // Imprime 2

/*    void method(int[] a) {
        System.out.println(2);
    }*/

}

