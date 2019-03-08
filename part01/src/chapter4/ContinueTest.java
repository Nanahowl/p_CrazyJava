package chapter4;

public class ContinueTest {
    public static void main(String[] args) {
        //This is the first simple circle.
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                System.out.println("It's continue!");
                continue;
            }
            System.out.println("i is: " + i);
        }

        System.out.println();
        //This is the circles which have label and outer circle.
        outer:
        for (int i = 1; i < 3; i++) {
            System.out.println("Outer i is " + i);
            for (int j = 1; j < 5; j++) {
                System.out.println("Inner j is " + j);
                if (i == j) {
                    //The inner circle will be finished, when i equal to j.
                    System.out.println("It's equal!");
                    continue outer;
                }
                //This continue is invalid!!!
                if (i == 1) {
                    continue;
                }
            }
        }
    }
}
