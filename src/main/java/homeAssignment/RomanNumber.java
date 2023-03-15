package homeAssignment;
/*
Create getRomanNumber method, which takes int and returns String
1 => I
2 => II
3 => III
4 => IV
5 => V
6 => VI
7 => VII
8 => VIII
9 => IX
10 => X
else, print "Couldn't find number" and return null
Must use switch statement.
 */
public class RomanNumber {
    public static void main(String[] args) {
        int number = 5;
        String romanNumber = getRomanNumber(number);
        System.out.println("The Roman numeral for " + number + " is " + romanNumber);
    }

    public static String getRomanNumber(int number) {
        switch (number) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            default:
                System.out.println("Couldn't find number");
                return null;
        }
    }
}
