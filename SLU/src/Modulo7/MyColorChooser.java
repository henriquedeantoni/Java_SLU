package Modulo7;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyColorChooser extends JPanel {
	private JSlider redSlider, greenSlider, blueSlider;
	    private JTextField redField, greenField, blueField;
	    private JPanel colorPreview;
	    
	    public MyColorChooser() {
	        setLayout(new GridLayout(4, 2));
	        
	        redSlider = createSlider();
	        greenSlider = createSlider();
	        blueSlider = createSlider();
	        
	        redField = createTextField();
	        greenField = createTextField();
	        blueField = createTextField();
	        
	        colorPreview = new JPanel();
	        colorPreview.setPreferredSize(new Dimension(100, 50));
	        updateColor();
	        
	        add(new JLabel("Red: "));
	        add(redSlider);
	        add(redField);
	        
	        add(new JLabel("Green: "));
	        add(greenSlider);
	        add(greenField);
	        
	        add(new JLabel("Blue: "));
	        add(blueSlider);
	        add(blueField);
	        
	        add(new JLabel("Preview: "));
	        add(colorPreview);
	        
	        ChangeListener listener = new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent e) {
	                updateColor();
	            }
	        };
	        
	        redSlider.addChangeListener(listener);
	        greenSlider.addChangeListener(listener);
	        blueSlider.addChangeListener(listener);
	    }
	    
	    private JSlider createSlider() {
	        JSlider slider = new JSlider(0, 255, 0);
	        slider.setMajorTickSpacing(50);
	        slider.setPaintTicks(true);
	        return slider;
	    }
	    
	    private JTextField createTextField() {
	        JTextField field = new JTextField(3);
	        field.setEditable(false);
	        field.setHorizontalAlignment(JTextField.CENTER);
	        return field;
	    }
	    
	    private void updateColor() {
	        int r = redSlider.getValue();
	        int g = greenSlider.getValue();
	        int b = blueSlider.getValue();
	        
	        redField.setText(String.valueOf(r));
	        greenField.setText(String.valueOf(g));
	        blueField.setText(String.valueOf(b));
	        
	        colorPreview.setBackground(new Color(r, g, b));
	    }
}
