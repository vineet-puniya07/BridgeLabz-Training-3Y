public class SpringSeason2 {
    public static void main(String[] args) {
        // take inputs from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean isSpring = false;

        // Check conditions for spring season
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 - March 31
            (month == 4 && day >= 1 && day <= 30) ||    // April
            (month == 5 && day >= 1 && day <= 31) ||    // May
            (month == 6 && day >= 1 && day <= 20)) {    // June 1 - June 20
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
