package examples.encapsulation.example1.library;

public final class Api {
    //private static class String {}

    // Nada
    // No compila
    // Error en tiempo de ejecución

    public static String newString() {
        return new String();
    }
}
