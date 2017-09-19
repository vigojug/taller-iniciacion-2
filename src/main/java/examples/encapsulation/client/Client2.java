package examples.encapsulation.client;

import examples.encapsulation.library.Api2;

public class Client2 {
    int answer = Api2.ANSWER;

    public static void main(String args[]){
        Client2 c = new Client2();
        System.out.println("API vale : " + c.answer);
    }
}
