/**
 * Created by ivanmolera on 18/4/17.
 */
public class Main {

    public static void main(String args[]) {
        try {
            RomanNumbers romanNumber = new RomanNumbers();
            RomanNumbers.showMenu();
            romanNumber.getChoice();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
