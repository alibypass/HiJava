import javax.swing.*;

public class calcultorUI {

    public static void main (String... args) {

        JFrame calculator = new JFrame("Calculator");

        JTextField resault = new JTextField();
        resault.setBounds(0, 0, 200, 50);
        resault.setEnabled(false);
        calculator.add(resault);

        JButton one = new JButton("1");
        one.setBounds(0, 50, 50, 50);
        calculator.add(one);

        JButton two = new JButton("2");
        two.setBounds(50, 50, 50, 50);
        calculator.add(two);

        JButton three = new JButton("3");
        three.setBounds(100, 50, 50, 50);
        calculator.add(three);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);
        calculator.add(plus);

        JButton four = new JButton("4");
        four.setBounds(0, 100, 50, 50);
        calculator.add(four);

        JButton five = new JButton("5");
        five.setBounds(50, 100, 50, 50);
        calculator.add(five);

        JButton six = new JButton("6");
        six.setBounds(100, 100, 50, 50);
        calculator.add(six);

        JButton mines = new JButton("-");
        mines.setBounds(150, 100, 50, 50);
        calculator.add(mines);

        JButton seven = new JButton("7");
        seven.setBounds(0, 150, 50, 50);
        calculator.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(50, 150, 50, 50);
        calculator.add(eight);


        JButton nine = new JButton("9");
        nine.setBounds(100, 150, 50, 50);
        calculator.add(nine);

        JButton mult = new JButton("*");
        mult.setBounds(150, 150, 50, 50);
        calculator.add(mult);

        JButton dot = new JButton(".");
        dot.setBounds(0, 200, 50, 50);
        calculator.add(dot);

        JButton zero = new JButton("0");
        zero.setBounds(50, 200, 50, 50);
        calculator.add(zero);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, 50, 50);
        calculator.add(equal);

        JButton divide = new JButton("/");
        divide.setBounds(150, 200, 50, 50);
        calculator.add(divide);



        calculator.setSize(220, 300);
        calculator.setLayout(null);
        calculator.setVisible(true);

    }
}
