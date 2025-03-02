package Modulo7;
import javax.swing.*;

public class ColorChooserApp_Exercicio5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seletor de Cores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        MyColorChooser colorChooser = new MyColorChooser();
        frame.add(colorChooser);
        
        frame.setVisible(true);
    }
}
