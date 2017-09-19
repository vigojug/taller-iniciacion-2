package examples.polymorphism.puzzlers1;

public class Poly5
{
    double overloadedMethod(double d)
    {
        return d *= d;
    }

    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }

    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }

    public static void main(String[] args)
    {
        Poly5 main = new Poly5();

        System.out.println(main.overloadedMethod(100));
    }
}

// ¿Qué imprime?
// 100
// No compila
// 0
// Error de ejecución
