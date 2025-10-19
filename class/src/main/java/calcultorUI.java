import javax.swing.*;

public class calcultorUI {

    public static void main (String... args) {

        JFrame calculator = new JFrame("Calculator");

        JTextField resault = new JTextField();
        resault.setBounds(0, 0, 150, 50);
        resault.setEditable(false);
        calculator.add(resault);

        JButton remove = new JButton("C");
        remove.setBounds(150, 0, 50, 50);
        remove.addActionListener(e -> resault.setText(""));
        calculator.add(remove);

        JButton one = new JButton("1");
        one.setBounds(0, 50, 50, 50);
        one.addActionListener(e -> resault.setText(resault.getText() + one.getText()));
        calculator.add(one);

        JButton two = new JButton("2");
        two.setBounds(50, 50, 50, 50);
        two.addActionListener(e -> resault.setText(resault.getText() + two.getText()));
        calculator.add(two);

        JButton three = new JButton("3");
        three.setBounds(100, 50, 50, 50);
        three.addActionListener(e -> resault.setText(resault.getText() + three.getText()));
        calculator.add(three);

        JButton plus = new JButton("+");
        plus.setBounds(150, 50, 50, 50);
        calculator.add(plus);

        JButton four = new JButton("4");
        four.setBounds(0, 100, 50, 50);
        four.addActionListener(e -> resault.setText(resault.getText() + four.getText()));
        calculator.add(four);

        JButton five = new JButton("5");
        five.setBounds(50, 100, 50, 50);
        five.addActionListener(e -> resault.setText(resault.getText() + five.getText()));
        calculator.add(five);

        JButton six = new JButton("6");
        six.setBounds(100, 100, 50, 50);
        six.addActionListener(e -> resault.setText(resault.getText() + six.getText()));
        calculator.add(six);

        JButton mines = new JButton("-");
        mines.setBounds(150, 100, 50, 50);
        calculator.add(mines);

        JButton seven = new JButton("7");
        seven.setBounds(0, 150, 50, 50);
        seven.addActionListener(e -> resault.setText(resault.getText() + seven.getText()));
        calculator.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(50, 150, 50, 50);
        eight.addActionListener(e -> resault.setText(resault.getText() + eight.getText()));
        calculator.add(eight);


        JButton nine = new JButton("9");
        nine.setBounds(100, 150, 50, 50);
        nine.addActionListener(e -> resault.setText(resault.getText() + nine.getText()));
        calculator.add(nine);

        JButton mult = new JButton("*");
        mult.setBounds(150, 150, 50, 50);
        calculator.add(mult);

        JButton dot = new JButton(".");
        dot.setBounds(0, 200, 50, 50);
        dot.addActionListener(e -> resault.setText(resault.getText() + dot.getText()));
        calculator.add(dot);

        JButton zero = new JButton("0");
        zero.setBounds(50, 200, 50, 50);
        zero.addActionListener(e -> resault.setText(resault.getText() + zero.getText()));
        calculator.add(zero);

        JButton equal = new JButton("=");
        equal.setBounds(100, 200, 50, 50);
        calculator.add(equal);

        JButton divide = new JButton("/");
        divide.setBounds(150, 200, 50, 50);
        calculator.add(divide);



        calculator.setSize(300, 300);
        calculator.setLayout(null);
        calculator.setVisible(true);

    }
}
