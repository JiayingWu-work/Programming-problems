import java.util.ArrayList;
import java.util.Scanner;

public class LicenseToLaunch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validDate = input.nextInt();
        ArrayList<Integer> numTrash = new ArrayList<>();

        for (int i = 0; i < validDate; i++) {
            numTrash.add(input.nextInt());
        }

        int minTrash = 100000;
        int minDay = 0;
        for (int i = 0; i < validDate; i++) {
            if (numTrash.get(i) < minTrash) {
               minTrash = numTrash.get(i);
               minDay = i;
            }
        }
        System.out.println(minDay);
    }
}