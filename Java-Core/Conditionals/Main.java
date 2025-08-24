public class Main {
    public static void main(String[] args) {
        // 1. Simple if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        // 2. if-else statement
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // 3. if-else-if ladder
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 4. Nested if statements
        int x = 10;
        int y = 20;
        if (x > 0) {
            if (y > 0) {
                System.out.println("Both x and y are positive");
            }
        }

        // 5. Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // 6. Ternary operator
        int a = 5;
        int b = 10;
        int max = (a > b) ? a : b;
        System.out.println("Maximum value is: " + max);
    }
}
