import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ivanmolera on 18/4/17.
 */
public class RomanNumbers {

    public static final HashMap<Integer, String> rn_unit 	 = new HashMap<Integer, String>();
    public static final HashMap<Integer, String> rn_decenal  = new HashMap<Integer, String>();
    public static final HashMap<Integer, String> rn_hundred  = new HashMap<Integer, String>();
    public static final HashMap<Integer, String> rn_thousand = new HashMap<Integer, String>();

    public RomanNumbers() {
        rn_unit.put(new Integer(0), "");
        rn_unit.put(new Integer(1), "I");
        rn_unit.put(new Integer(2), "II");
        rn_unit.put(new Integer(3), "III");
        rn_unit.put(new Integer(4), "IV");
        rn_unit.put(new Integer(5), "V");
        rn_unit.put(new Integer(6), "VI");
        rn_unit.put(new Integer(7), "VII");
        rn_unit.put(new Integer(8), "VIII");
        rn_unit.put(new Integer(9), "IX");

        rn_decenal.put(new Integer(0), "");
        rn_decenal.put(new Integer(1), "X");
        rn_decenal.put(new Integer(2), "XX");
        rn_decenal.put(new Integer(3), "XXX");
        rn_decenal.put(new Integer(4), "XL");
        rn_decenal.put(new Integer(5), "L");
        rn_decenal.put(new Integer(6), "LX");
        rn_decenal.put(new Integer(7), "LXX");
        rn_decenal.put(new Integer(8), "LXXX");
        rn_decenal.put(new Integer(9), "XC");

        rn_hundred.put(new Integer(0), "");
        rn_hundred.put(new Integer(1), "C");
        rn_hundred.put(new Integer(2), "CC");
        rn_hundred.put(new Integer(3), "CCC");
        rn_hundred.put(new Integer(4), "CD");
        rn_hundred.put(new Integer(5), "D");
        rn_hundred.put(new Integer(6), "DC");
        rn_hundred.put(new Integer(7), "DCC");
        rn_hundred.put(new Integer(8), "DCCC");
        rn_hundred.put(new Integer(9), "CM");

        rn_thousand.put(new Integer(0), "");
        rn_thousand.put(new Integer(1), "M");
        rn_thousand.put(new Integer(2), "MM");
        rn_thousand.put(new Integer(3), "MMM");
    }

    public String convertUnits(Integer number) {
        return rn_unit.get(number);
    }

    public String convertDecenals(Integer number) {
        return rn_decenal.get(number);
    }

    public String convertHundreds(Integer number) {
        return rn_hundred.get(number);
    }

    public String convertThousands(Integer number) {
        return rn_thousand.get(number);
    }

    public String convertToRomanNumber(Integer number) {

        String romanNumber = "";

        LinkedList<Integer> stack = new LinkedList<Integer>();

        while (number > 0) {
            stack.push( number % 10 );
            number = number / 10;
        }

        while (!stack.isEmpty()) {
            switch(stack.size()) {
                case 4: romanNumber += convertThousands(stack.pop());
                    break;
                case 3: romanNumber += convertHundreds(stack.pop());
                    break;
                case 2: romanNumber += convertDecenals(stack.pop());
                    break;
                case 1: romanNumber += convertUnits(stack.pop());
                    break;
            }
        }

        return romanNumber;
    }

    public static void showMenu() {
        System.out.println("#################################");
        System.out.println("# Enter a number from 1 to 3999 #");
        System.out.println("#################################");
    }

    public void getChoice() {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String line = scanner.nextLine();

            try {
                Integer number = new Integer(line);

                if(number.intValue() > 0 && number.intValue() <= 3999) {
                    String romanNumber = convertToRomanNumber(number);

                    System.out.println(number + " -> " + romanNumber);
                }
                else {
                    System.out.println("You must enter a number from 1 to 3999!");
                }
            }
            catch(NumberFormatException nfe) {
                if(line.equalsIgnoreCase("q")) {
                    break;
                }
                else {
                    System.out.println("You must enter a number from 1 to 3999!");
                }
            }
        }

        scanner.close();
    }
}
