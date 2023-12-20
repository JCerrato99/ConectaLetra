package conectaLetra;

import java.awt.GridBagLayout;

import javax.swing.*;

public class Vista extends JFrame {

     JButton botonJugar = new JButton("Jugar");
     JButton foto1 = new JButton();
     JButton foto2 = new JButton();
     JButton foto3 = new JButton();
     JButton foto4 = new JButton();
     JPanel panelPrincipal = new JPanel(new GridBagLayout());
     JPanel panelElegirPiezas = new JPanel(new GridBagLayout());
     

    public Vista() {
        Look.applyStyles(this,panelPrincipal, botonJugar);


        Look.applyStyles(panelElegirPiezas, foto1, foto2, foto3, foto4);

    }

    public JButton obtenerBotonJugar() {
        return botonJugar;
    }

    
}