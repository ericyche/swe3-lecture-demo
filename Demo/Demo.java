package Demo;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int x = new Random().nextInt();
        // Task 1: If number is even, print "Hello"
        // Task 2: If number is odd, print "World"
        if (x % 2 == 1) {
            System.out.println("World");
        }
        if (x % 2 == 0) {
            System.out.println("Hello");
        }
        System.out.println("Test");
    }
}
