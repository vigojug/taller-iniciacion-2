package examples.polymorphism.puzzlers1;

class A {
}

class B extends A {
}

class C extends B {
}

public class Poly1 {
    static void overloadedMethod(A a) {
        System.out.println("ONE");
    }

    static void overloadedMethod(B b) {
        System.out.println("TWO");
    }

    static void overloadedMethod(Object obj) {
        System.out.println("THREE");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Object o = new Object();

        overloadedMethod(c);

// ¿Qué imprime?

// ONE
// TWO
// THREE
// Otra cosa

        if (false) {
            overloadedMethod(a);
            overloadedMethod(b);
            overloadedMethod(o);
        }
    }
}

