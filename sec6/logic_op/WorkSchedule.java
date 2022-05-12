public class WorkSchedule {
    public static void main(String[] args) {
        /* Days of the week:
            1 is Monday
            2 is Tuesday
            3 is Wednesday
            4 is Thursday
            5 is Friday
            6 is Saturday
            7 is Sunday
        */
        int day = 1;  
        boolean holiday = false;
         
        if ( holiday) {
            // if it's a holiday, print: "woohoo, no work!");
            System.out.println("woohoo, no work!");
        }
        else if (day >= 6 && day <= 7 && !holiday) {
            // if it's the weekend, print: "it's the weekend, no work!"
            System.out.println("it's the weekend, no work!");
        }
        // otherwise, print: "Wake up at 7:00 :( ";
        else {
            System.out.println("Wake up at 7:00 :( ");
        }
        }

    }
