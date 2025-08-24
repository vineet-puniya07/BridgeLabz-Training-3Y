    public class Main {
        public static void main(String[] args) {
            // 1. For Loop
            System.out.println("For Loop:");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Iteration " + i);
            }

            // 2. While Loop
            System.out.println("\nWhile Loop:");
            int count = 1;
            while (count <= 3) {
                System.out.println("Count: " + count);
                count++;
            }

            // 3. Do-While Loop
            System.out.println("\nDo-While Loop:");
            int num = 1;
            do {
                System.out.println("Number: " + num);
                num++;
            } while (num <= 3);

            // 4. Enhanced For Loop (For-Each)
            System.out.println("\nEnhanced For Loop:");
            int[] numbers = {
                1,
                2,
                3
            };
            for (int number: numbers) {
                System.out.println("Value: " + number);
            }

            // 5. Nested Loop
            System.out.println("\nNested Loop:");
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.println("i: " + i + ", j: " + j);
                }
            }

            // 6. Infinite Loop with break
            System.out.println("\nInfinite Loop with break:");
            int x = 1;
            while (true) {
                System.out.println("Breaking at x = " + x);
                if (x == 1) break;
            }

            // 7. Loop with continue
            System.out.println("\nLoop with continue:");
            for (int i = 1; i <= 3; i++) {
                if (i == 2) continue;
                System.out.println("Value (skipping 2): " + i);
            }
            
            System.out.println("Nested Do While Loop:");
            //8 nested do-while loop
            int a = 10;
            int b = 10;
            do {
                System.out.println("a: " + a);
                a--;
                do {
                    System.out.println("b: " + b);
                    b--;
                } while (b > 0);
            } while (a > 0);


            System.out.println("Nested For Loop:");
            //9 nested for loop
            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("i: " + i + ", j: " + j);
                }
            }

            System.out.println("Nested While Loop:");
            //10 nested while loop
            int c = 10;
            int d = 10;
            while (c > 0) {
                System.out.println("c: " + c);
                c--;
                while (d > 0) {
                    d--;
                    System.out.println("d: " + d);
                }
            }
        }
    }