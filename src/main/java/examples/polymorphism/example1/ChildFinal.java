package examples.polymorphism.example1;

abstract class FinalParent {

    abstract void printX();

    final void printY() {
    }
}

// ¿Qué sucede si extiendo esta clase de AbstractParent?. ¿Cómo lo arreglo?

// public class ChildFinal extends FinalParent {
public class ChildFinal {

    void printX() {
    }

    void printY() {
    }

}
