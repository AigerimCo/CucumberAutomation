package switchStatement;

public class TshirtSize {

    /*
    return extra-small if size is in range from 0 to 3
    return small if size is in range from 4 to 6
    return medium if size is in range from 7 to 9
    return large if size is in range from 10 to 13
    return extra large if size is in range from 14 to 18
     */
    public static String getSize(int size) {

        String str = "Extra small";
        String str2 = "Small";
        String str3 = "Medium";
        String str4 = "Large";
        String str5 = "Extra large";

        switch (size) {
            case 0:
            case 1:
            case 2:
            case 3:
                return "Extra small";
            case 4:
            case 5:
            case 6:
                return "small";
            case 7:
            case 8:
            case 9:
                return "medium";
            case 10:
            case 11:
            case 12:
            case 13:
                return "large";
            default:
               return "Wrong size";
        }

    }
}




