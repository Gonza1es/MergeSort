package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JButton button = new JButton("Go");
    private JTextField input = new JTextField("Enter the number of items",5);
    private JTextField input_minBound = new JTextField("Enter the bottom border",5);
    private JTextField input_maxBound = new JTextField("Enter the upper border",5);

    public GUI(){
        super("Merge sort");
        this.setBounds(100,100,300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,1,2,2));
        container.add(input);
        container.add(input_minBound);
        container.add(input_maxBound);
        container.add(button);
        button.addActionListener(new ButtonEventListener());

    }
    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Integer input_int = Integer.valueOf(input.getText());
                if (input_int<0) {
                    System.out.println("Неверный формат строки");
                }else {
                    Integer input_int_min = Integer.valueOf(input_minBound.getText());
                    Integer input_int_max = Integer.valueOf(input_maxBound.getText());
                    if (input_int_max<input_int_min){
                        System.out.println("Ошибка ввода границ генерации");
                    } else{
                        Start run = new Start();
                        run.run_algo(input_int, input_int_min, input_int_max);
                    }
                }
            } catch (NumberFormatException except) {
                System.err.println("Неверный формат строки");
            }

        }
    }


}
