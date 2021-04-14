package tddkata;

public class Calc {

    public int sum(String expression) {
        if (expression != null
                && !expression.contains("-")
                && !expression.contains("\n\n")
                && !expression.endsWith("\n")) {
            if (expression.equals("")) {
                return 0;
            }
            String[] arrayNumbers = expression.split("[,\n]+");
            try {
                int value = 0;
                for (String number : arrayNumbers) {
                    value = value + Integer.parseInt(number);
                }
                return value;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }
}
