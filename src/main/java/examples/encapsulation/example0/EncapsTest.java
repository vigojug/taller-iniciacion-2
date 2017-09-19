package examples.encapsulation.example0;

class EncapsulationDemo{

    private int age;

    // Note: the getters and setters
    public int getEmpAge(){
        return age;
    }

    public void setEmpAge(int newValue){
        age = newValue;
    }
}

public class EncapsTest{

    public static void main(String args[]){

        EncapsulationDemo obj = new EncapsulationDemo();

        obj.setEmpAge(32);
        System.out.println("Employee Age: " + obj.getEmpAge());
    }

}
