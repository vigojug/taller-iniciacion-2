package examples.encapsulation;

final class Aux {
    //private static class String {}

    // Nada
    // No compila
    // Error en tiempo de ejecución

    public static String newString() {
        return new String();
    }
}

public class Enc1 {
    String s = Aux.newString();
}
