package calculator;

import javax.swing.*;

public class CalculatorUI {
    public static String number1;
    public static void main (String... args) {

        JFrame calculator = new JFrame("Calculator");

        JTextField textField = new JTextField();
        textField.setBounds(0, 0, 150, 50);
        textField.setEditable(false);
        calculator.add(textField);

        JButton remove = new JButton("C");
        remove.setBounds(150, 0, 50, 50);
        remove.addActionListener(e -> textField.setText(""));
        calculator.add(remove);

        JButton one = new JButton("1");
        one.setBounds(0, 50, 50, 50);
        one.addActionListener(e -> textField.setText(textField.getText() + one.getText()));
        calculator.add(one);

        JButton two = new JButton("2");
        two.setBounds(50, 50, 50, 50);
        two.addActionListener(e -> textField.setText(textField.getText() + two.getText()));
        calculator.add(two);

        JButton three = new JButton("3");
        three.setBounds(100, 50, 50, 50);
        three.addActionListener(e -> textField.setText(textField.getText() + three.getText()));
        calculator.add(three);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);
        plus.addActionListener(e -> {
            number1 = textField.getText();
            textField.setText("");
        });
        calculator.add(plus);

        JButton four = new JButton("4");
        four.setBounds(0, 100, 50, 50);
        four.addActionListener(e -> textField.setText(textField.getText() + four.getText()));
        calculator.add(four);

        JButton five = new JButton("5");
        five.setBounds(50, 100, 50, 50);
        five.addActionListener(e -> textField.setText(textField.getText() + five.getText()));
        calculator.add(five);

        JButton six = new JButton("6");
        six.setBounds(100, 100, 50, 50);
        six.addActionListener(e -> textField.setText(textField.getText() + six.getText()));
        calculator.add(six);

        JButton mines = new JButton("-");
        mines.setBounds(150, 100, 50, 50);
        calculator.add(mines);

        JButton seven = new JButton("7");
        seven.setBounds(0, 150, 50, 50);
        seven.addActionListener(e -> textField.setText(textField.getText() + seven.getText()));
        calculator.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(50, 150, 50, 50);
        eight.addActionListener(e -> textField.setText(textField.getText() + eight.getText()));
        calculator.add(eight);


        JButton nine = new JButton("9");
        nine.setBounds(100, 150, 50, 50);
        nine.addActionListener(e -> textField.setText(textField.getText() + nine.getText()));
        calculator.add(nine);

        JButton mult = new JButton("*");
        mult.setBounds(150, 150, 50, 50);
        calculator.add(mult);

        JButton dot = new JButton(".");
        dot.setBounds(0, 200, 50, 50);
        dot.addActionListener(e -> textField.setText(textField.getText() + dot.getText()));
        calculator.add(dot);

        JButton zero = new JButton("0");
        zero.setBounds(50, 200, 50, 50);
        zero.addActionListener(e -> textField.setText(textField.getText() + zero.getText()));
        calculator.add(zero);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, 50, 50);
        equal.addActionListener(e -> {
            Calculator calc = new Calculator();
            String addresult = calc.add(number1, textField.getText());
            textField.setText(addresult);
        });
        calculator.add(equal);

        JButton divide = new JButton("/");
        divide.setBounds(150, 200, 50, 50);
        calculator.add(divide);



        calculator.setSize(300, 300);
        calculator.setLayout(null);
        calculator.setVisible(true);

    }
}
