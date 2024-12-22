package calculator;
        
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private final JTextField textField;
    private double num1, num2;
    private String operator;
    private boolean decimalClicked;
    

    public Calculator() {
        setTitle("Calculator by Shishov");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();//поле ввода
        textField.setFont(new Font("Times New Roman", Font.BOLD, 24));
        textField.setBounds(16, 10, 248, 36);
        textField.setBackground(Color.white);
        textField.setHorizontalAlignment(JTextField.RIGHT);
            
        add(textField, BorderLayout.NORTH);

        //кнопки
        JPanel buttonPanel = new JPanel(new GridLayout(6, 4));
        String[] buttonLabels = {"1", "2", "3", "+",
                                 "4", "5", "6", "-",
                                 "7", "8", "9", "*",
                                 ".", "0", "=", "/",
                                 "sin", "cos", "tan", "sqrt",
                                 "C"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals(".")) {
            if (!decimalClicked) {
                textField.setText(textField.getText() + ".");
                decimalClicked = true;
            }
        } else if (command.equals("C")) {
            textField.setText("");
            decimalClicked = false;
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            double result = calculate(num1, num2, operator);
            textField.setText(String.valueOf(result));
            decimalClicked = false;
        } else if (command.equals("cos") || command.equals("sin") || command.equals("tan") || command.equals("sqrt")) {
            num1 = Double.parseDouble(textField.getText());
            operator = command;
            if ((operator.equals("sqrt")) && (num1 < 0)) { // проверка на правомерность извлечения корня
                textField.setText("Нельзя!");
            } else { if (operator.equals("tan") && (num1 / 90 - (int)(num1/90) == 0)) { //проверка на правомерность тангенса
                textField.setText("Нельзя!"); //эту проверку надо переписать, поскольку работает некорректно
            } else {
                    if (operator.equals("tan") || operator.equals("cos") || operator.equals("sin")) {
                        num1 = num1 / 180 * Math.PI; //перевод градусов в радианы
                    }
                    double result = calculate(num1, 0, operator);
                    textField.setText(String.valueOf(result));
               }
            }
                decimalClicked = false;
                
        } else {
            num1 = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
            decimalClicked = false;
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return 0; //
                }
            case "cos":
                return Math.cos(num1);
            case "sin":
                return Math.sin(num1);
            case "tan":
                return Math.tan(num1);
            case "sqrt":
                return Math.sqrt(num1);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
