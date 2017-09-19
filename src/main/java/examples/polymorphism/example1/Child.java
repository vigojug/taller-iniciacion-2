package examples.polymorphism.example1;

class Parent {
    int x;

    Parent(int x) {   // Constructor with a parameter.
        this.x = x;
    }
}

// ¿Qué sucede si extiendo esta clase de Parent?. ¿Cómo lo arreglo?
// public class Child extends Parent {
public class Child {

    int y;

    Child(int y) {
        this.y = y;
    }
}
