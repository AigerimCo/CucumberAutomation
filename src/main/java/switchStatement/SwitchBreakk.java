package switchStatement;

public class SwitchBreakk {
    public static void main(String[] args) {

         /*
        The value for a case must be constant or literal.
        Variables are not allowed.
         */

        String season = "fall";
        String str = "summer";

        switch (season) {

            case "winter":
                System.out.println("snowing,cold");
            case "fall":
                System.out.println("raining,cold");
            case "summer":
                System.out.println("hot,sunny");
            case "spring":
                System.out.println("sunny,chill");
            default:
                System.out.println("no valid season");
                break;
        }
    }
}

