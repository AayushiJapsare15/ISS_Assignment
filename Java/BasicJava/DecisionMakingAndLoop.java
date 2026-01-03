package BasicJava;
public class DecisionMakingAndLoop {
    public static void main(String[] args) {

        //decision making
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        //switch
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
                System.out.println("Invalid day");
        }

        //loops

        //for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //while loop
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        //do while loop
        i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
    
}
