package Modulo7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMelhorado_Exercicio3 {
	public static void main(String[] args) {
        
        JFrame frame = new JFrame("Conversor de Temperatura");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        JLabel labelEntrada = new JLabel("Temperatura:");
        JTextField textFieldTemperatura = new JTextField(10);
        
        JLabel labelDe = new JLabel("De:");
        String[] escalas = {"Fahrenheit", "Celsius", "Kelvin"};
        JComboBox<String> comboBoxDe = new JComboBox<>(escalas);
        
        JLabel labelPara = new JLabel("Para:");
        JComboBox<String> comboBoxPara = new JComboBox<>(escalas);
        
        JButton buttonConverter = new JButton("Converter");
        JLabel labelResultado = new JLabel("Resultado: ");

        buttonConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temperatura = Double.parseDouble(textFieldTemperatura.getText());
                    String de = (String) comboBoxDe.getSelectedItem();
                    String para = (String) comboBoxPara.getSelectedItem();
                    double resultado = 0;
                    
                    if (de.equals("Fahrenheit")) {
                        if (para.equals("Celsius")) {
                            resultado = (5.0 / 9.0) * (temperatura - 32);
                        } else if (para.equals("Kelvin")) {
                            resultado = (5.0 / 9.0) * (temperatura - 32) + 273.15;
                        } else {
                            resultado = temperatura;
                        }
                    } else if (de.equals("Celsius")) {
                        if (para.equals("Fahrenheit")) {
                            resultado = (9.0 / 5.0) * temperatura + 32;
                        } else if (para.equals("Kelvin")) {
                            resultado = temperatura + 273.15;
                        } else {
                            resultado = temperatura;
                        }
                    } else if (de.equals("Kelvin")) {
                        if (para.equals("Celsius")) {
                            resultado = temperatura - 273.15;
                        } else if (para.equals("Fahrenheit")) {
                            resultado = (9.0 / 5.0) * (temperatura - 273.15) + 32;
                        } else {
                            resultado = temperatura;
                        }
                    }
                    
                    labelResultado.setText(String.format("Resultado: %.2f %s", resultado, para));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(labelEntrada);
        frame.add(textFieldTemperatura);
        frame.add(labelDe);
        frame.add(comboBoxDe);
        frame.add(labelPara);
        frame.add(comboBoxPara);
        frame.add(buttonConverter);
        frame.add(labelResultado);

        frame.setVisible(true);
    }
}
