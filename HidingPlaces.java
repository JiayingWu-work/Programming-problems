import java.util.ArrayList;
import java.util.Scanner;

public class HidingPlaces {
    
    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);

        ArrayList<String> eachSpot = new ArrayList<>();
        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < number.size(); j++) {
                eachSpot.add(alphabet.get(i) + number.get(j));
            }
        }

        Scanner input = new Scanner(System.in);
        String initialSpot = input.nextLine();
        char [] eachInitialSpot = initialSpot.toCharArray();

        System.out.println(eachInitialSpot);
        
        ArrayList<String> visitedList = new ArrayList<>();

        
    }
}
