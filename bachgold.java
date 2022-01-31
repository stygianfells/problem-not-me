import java.util.ArrayList;

public class bachgold {
    //so it works but
    //not for certain prime numbers??? 
    //halp what
    public static void pair(int take) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < uno.primeee(take).size(); i++) {

            int whatever = uno.primeee(take).get(i);

            if (uno.primeee(take).contains(take-whatever)) {
                num1 = whatever;
                num2 = take-whatever;
            }

        }

        System.out.println(num1 + " " + num2); 
    }

    public static void main (String[] args) {
        pair(4); 
    }
}
