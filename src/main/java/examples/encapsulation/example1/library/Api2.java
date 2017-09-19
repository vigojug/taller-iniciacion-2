package examples.encapsulation.example1.library;

class ApiBase {
    public static final int ANSWER = 42;
}

public final class Api2 extends ApiBase {
    //private static final int ANSWER = 43;

    public static void main(String args[]) {
        System.out.println("API vale : " + ANSWER);
    }

}
