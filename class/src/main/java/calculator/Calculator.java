package calculator;

public class Calculator {

    public String add(String num1, String num2) {
        double n1 = 0;
        double n2 = 0;
        try {
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2);
        } catch (NumberFormatException nfe) {
            System.out.println("number invalid");
            throw nfe;
        } finally {
            System.out.println("retry ??");
        }
        double result = n1 + n2;
        return String.valueOf(result);
    }

    public String mines(String num1, String num2) {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double result = n1 + n2;
        return String.valueOf(result);
    }
}
