package Modulo7;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CirculoPanel extends JPanel {
    private int raio;
    private int diametro;
    private double area;
    private double circunferencia;
    
    public CirculoPanel() {
        Random rand = new Random();
        this.raio = rand.nextInt(100) + 10;
        this.diametro = 2 * raio;
        this.area = Math.PI * Math.pow(raio, 2);
        this.circunferencia = 2 * Math.PI * raio;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - diametro) / 2;
        int y = (getHeight() - diametro) / 2;
        g.drawOval(x, y, diametro, diametro);
    }
    
    public String getDadosCirculo() {
        return String.format("Raio: %d px\nDiâmetro: %d px\nÁrea: %.2f px²\nCircunferência: %.2f px", 
                raio, diametro, area, circunferencia);
    }
}
