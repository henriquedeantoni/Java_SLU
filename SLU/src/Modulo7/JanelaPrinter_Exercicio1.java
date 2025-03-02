package Modulo7;
import javax.swing.*;
import java.awt.*;

public class JanelaPrinter_Exercicio1 {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Printer Setup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Printer Label
        JLabel printerLabel = new JLabel("Printer: MyPrinter");
        printerLabel.setBounds(10, 10, 400, 30);
        frame.add(printerLabel);

        // Text Fields
        JTextField field1 = new JTextField();
        field1.setBounds(10, 50, 100, 90);
        frame.add(field1);
        
        JTextField field2 = new JTextField();
        field2.setBounds(120, 50, 100, 90);
        frame.add(field2);
        
        JTextField field3 = new JTextField();
        field3.setBounds(230, 50, 100, 90);
        frame.add(field3);
        
        // Checkboxes
        JCheckBox imageCheck = new JCheckBox("Image");
        JCheckBox textCheck = new JCheckBox("Text");
        JCheckBox codeCheck = new JCheckBox("Code");
        imageCheck.setBounds(120, 50, 50, 30);
        textCheck.setBounds(120, 80, 50, 30);
        codeCheck.setBounds(120, 110, 50, 30);
        frame.add(imageCheck);
        frame.add(textCheck);
        frame.add(codeCheck);

        // Radio Buttons
        JRadioButton selectionRadio = new JRadioButton("Selection");
        JRadioButton allRadio = new JRadioButton("All");
        JRadioButton appletRadio = new JRadioButton("Applet");
        ButtonGroup group = new ButtonGroup();
        group.add(selectionRadio);
        group.add(allRadio);
        group.add(appletRadio);
        selectionRadio.setBounds(340, 50, 100, 30);
        allRadio.setBounds(340, 80, 100, 30);
        appletRadio.setBounds(340, 110, 100, 30);
        frame.add(selectionRadio);
        frame.add(allRadio);
        frame.add(appletRadio);

        // Buttons
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton setupButton = new JButton("Setup...");
        JButton helpButton = new JButton("Help");
        okButton.setBounds(460, 10, 100, 30);
        cancelButton.setBounds(460, 50, 100, 30);
        setupButton.setBounds(460, 90, 100, 30);
        helpButton.setBounds(460, 130, 100, 30);
        frame.add(okButton);
        frame.add(cancelButton);
        frame.add(setupButton);
        frame.add(helpButton);

        // Print Quality Label
        JLabel qualityLabel = new JLabel("Print Quality");
        qualityLabel.setBounds(10, 160, 200, 30);
        frame.add(qualityLabel);

        // ComboBox
        String[] qualityOptions = {"High", "Medium", "Low"};
        JComboBox<String> qualityBox = new JComboBox<>(qualityOptions);
        qualityBox.setBounds(230, 160, 100, 30);
        frame.add(qualityBox);

        // Print to File Checkbox
        JCheckBox printToFileCheck = new JCheckBox("Print to File");
        printToFileCheck.setBounds(340, 160, 150, 30);
        frame.add(printToFileCheck);
        
        frame.setVisible(true);
	}
}
