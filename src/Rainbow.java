public class Rainbow implements StringPrinter {

    final String ERROR = "error";
    final String RED = "red";
    final String ORANGE = "orange";
    final String YELLOW = "yellow";
    final String GREEN = "green";
    final String LIGHT_BLUE = "light blue";
    final String BLUE = "blue";
    final String VIOLET = "violet";
    Rainbow(int number) {
        String result = numberCheck(number);
        print(result);
    }
    Rainbow(int number1, int number2) {
        String result1 = numberCheck(number1);
        String result2 = numberCheck(number2);
        if (result1.equals(ERROR) || result2.equals(ERROR)) {
           print(ERROR);
        } else {
            if (result1.equals(result2)) {
                print(result1);
            } else {
                StringBuilder sb = new StringBuilder(result1);
                sb.append("-");
                sb.append(result2);
                print(sb.toString());
            }
        }
    }

    private String numberCheck(int number) {
        String result;
        switch (number) {
            case (1):
                result = RED;
                break;
            case (2):
                result = ORANGE;
                break;
            case (3):
                result = YELLOW;
                break;
            case (4):
                result = GREEN;
                break;
            case (5):
                result = LIGHT_BLUE;
                break;
            case (6):
                result = BLUE;
                break;
            case (7):
                result = VIOLET;
                break;
            default:
                result = ERROR;
                break;
        }
        return result;
    }
}
