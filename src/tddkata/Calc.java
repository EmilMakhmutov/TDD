package tddkata;

public class Calc {

    public int sum(String expression) {
        if (expression != null && !expression.contains("-")) {
            if (expression.equals("")) {
                return 0;
            }
            String[] arrayNumbers = expression.split(",");
            try {
                switch (arrayNumbers.length) {
                    case 1:
                        return Integer.parseInt(arrayNumbers[0]);
                    case 2:
                        return Integer.parseInt(arrayNumbers[0]) + Integer.parseInt(arrayNumbers[1]);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }
}
