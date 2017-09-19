package examples.encapsulation;

class Base {
    public static final int ANSWER = 42;
}

final class BaseExtended extends Base {

    // ¿Qué sucede si descomentamos la siguiente línea?

    //private static final int ANSWER = 43;

    // Imprime 42
    // Imprime 43
    // No compila
    // Da un error en tiempo de ejecución
}

public class Enc2 {
    int answer = BaseExtended.ANSWER;

    public static void main(String args[]){
        Enc2 c = new Enc2();
        System.out.println("API vale : " + c.answer);
    }
}

