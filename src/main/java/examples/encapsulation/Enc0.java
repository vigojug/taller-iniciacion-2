package examples.encapsulation;

class EncapsulationDemo {

    private int age;

    // Note: the getters and setters
    public int getAge() {
        return age;
        // return age * 365 / 400;
    }

    public void setAge(int newValue) {
        age = newValue;
    }
}

public class Enc0 {

    public static void main(String args[]) {

        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setAge(32);
        System.out.println("Employee Age: " + obj.getAge());
        // System.out.println("Employee Age: " + obj.age);
    }

}
