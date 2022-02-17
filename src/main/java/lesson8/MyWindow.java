package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public int value;

    public MyWindow(int initialValue) {
        value = initialValue;
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300,120);

        Font font = new Font("Arial", Font.BOLD, 32);
        JTextField counterValue = new JTextField(String.valueOf(initialValue));
        JButton increaseButton = new JButton("+");
        JButton decreaseButton = new JButton("-");

        add(increaseButton, BorderLayout.EAST);
        add(decreaseButton, BorderLayout.WEST);
        add(counterValue, BorderLayout.CENTER);

        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        counterValue.setFont(font);
        increaseButton.setFont(font);
        decreaseButton.setFont(font);


        increaseButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValue.setText(String.valueOf(value));
            }
        });

        decreaseButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValue.setText(String.valueOf(value));
            }
        });

        counterValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(counterValue.getText());
                counterValue.setText(String.valueOf(value));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
          new MyWindow(0);
    }
}
