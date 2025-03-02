package Modulo7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemperatura_Exercicio2 {
	public static void main(String[] args) {
        
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 120);
        frame.setLayout(new FlowLayout());
        
        JLabel labelFahrenheit = new JLabel("Temperatura em Fahrenheit:");
        JTextField textFieldFahrenheit = new JTextField(10);
        JButton buttonConverter = new JButton("Converter");
        JLabel labelResultado = new JLabel("Temperatura em Celsius: ");

        buttonConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(textFieldFahrenheit.getText());
                    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
                    labelResultado.setText(String.format("Temperatura em Celsius: %.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(labelFahrenheit);
        frame.add(textFieldFahrenheit);
        frame.add(buttonConverter);
        frame.add(labelResultado);

        frame.setVisible(true);
    }
}
