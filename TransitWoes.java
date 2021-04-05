import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TransitWoes {

    // s = leave house
    // t = class start
    // n = nth times

    // first line: s, t, n
    // second line: walking time
    // third line: bus time
    // fourth line: bus arrives

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer s = scanner.nextInt();
        Integer t = scanner.nextInt();
        Integer n = scanner.nextInt();

        int[] walkingTime = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            walkingTime[i] = scanner.nextInt();
        }

        int[] busDuration = new int[n];
        for (int j = 0; j < n; j++) {
            busDuration[j] = scanner.nextInt();
        }

        int[] busIntervals = new int[n];
        for (int k = 0; k < n; k++) {
            busIntervals[k] = scanner.nextInt();
        }
        scanner.close();

        int totalTime = 0;

        if (walkingTime[0] == 0){
            totalTime += 0;
        }
        else {
            totalTime += busIntervals[0];
        }

        totalTime += busDuration[0];
        totalTime += walkingTime[1];
        if (totalTime != )


    }
    
}
