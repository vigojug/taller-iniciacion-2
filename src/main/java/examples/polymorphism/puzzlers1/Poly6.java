package examples.polymorphism.puzzlers1;

class I {
    void calculate(int a, int b) {
        System.out.println("Class I");
    }
}

class J extends I {
    @Override
    void calculate(int a, int b) {
        System.out.println("Class J");
    }
}

class Z extends J {
    @Override
    void calculate(int a, int b) {
        System.out.println("Class Z");
    }
}

public class Poly6 {
    public static void main(String[] args) {
        I i = new J();
        i.calculate(10, 20);
        J j = (J) i;
        j.calculate(50, 100);
        Z z = (Z) j;
        z.calculate(100, 200);
    }
}

// ¿Cuál será la salida?
// Class I Class J Class Z
// Class J Class I Class Z
// Class Z Class I Class J
// Runtime exception
