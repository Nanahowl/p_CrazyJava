package chapter4;

public class BreakTest {

    public static void main(String[] args) {
        //This is the first simple circle.
        for (int i = 1; i < 10; i++) {
            System.out.println("i is: " + i);
            if (i == 3) {
                System.out.println("It's Done!\n");
                break;
            }
        }

        //This is the circles which have label and outer circle.
        outer:
        for (int i = 1; i < 10; i++) {
            System.out.println("Outer i is " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println("Inner j is " + j);
                if (i == j) {
                    //The circle will be finished, when i equal to j.
                    System.out.println("It's Done!\n");
                    break outer;
                }
            }
        }
    }}

