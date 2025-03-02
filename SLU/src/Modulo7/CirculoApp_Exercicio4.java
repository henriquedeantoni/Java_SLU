package Modulo7;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CirculoApp_Exercicio4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Círculo e seus Atributos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        
        CirculoPanel circuloPanel = new CirculoPanel();
        JTextArea textArea = new JTextArea(4, 20);
        textArea.setText(circuloPanel.getDadosCirculo());
        textArea.setEditable(false);
        
        frame.add(circuloPanel, BorderLayout.CENTER);
        frame.add(new JScrollPane(textArea), BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
