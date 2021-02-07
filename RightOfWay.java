import java.util.Scanner;

public class RightOfWay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String direction = input.nextLine();
        String [] splitDirections = direction.split(" ");
        input.close();

        String a = splitDirections[0];
        String b = splitDirections[1];
        String c = splitDirections[2];

        int yeildScore = 0;

        // When you want to pass straight through the intersection
        if (a.equals("South") && b.equals("North")) {
            if (c.equals("East")) {
                yeildScore += 1;
            }
        }
        if (a.equals("North") && b.equals("South")) {
            if (c.equals("West")) {
                yeildScore += 1;
            }
        }
        if (a.equals("East") && b.equals("West")) {
            if (c.equals("North")) {
                yeildScore += 1;
            }
        }
        if (a.equals("West") && b.equals("East")) {
            if (c.equals("South")) {
                yeildScore += 1;
            }
        }

        // When You want to turn left at the intersection;
        if (a.equals("South") && b.equals("West")) {
            if (c.equals("North") || c.equals("East")) {
                yeildScore += 1;
            }
        }
        if (a.equals("West") && b.equals("North")) {
            if (c.equals("East") || c.equals("South")) {
                yeildScore += 1;
            }
        }
        if (a.equals("North") && b.equals("East")) {
            if (c.equals("West") || c.equals("South")) {
                yeildScore += 1;
            }
        }
        if (a.equals("East") && b.equals("South")) {
            if (c.equals("West") || c.equals("North")) {
                yeildScore += 1;
            }
        }

        // What is your score? 
        if (yeildScore >= 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}