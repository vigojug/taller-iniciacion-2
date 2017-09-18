package examples.encapsulation.library;

public final class Api {
    //private static class String {}

    // Nada
    // No compila
    // Error en tiempo de ejecución

    public static String newString() {
        return new String();
    }
}
