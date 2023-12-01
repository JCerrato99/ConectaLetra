package conectaLetra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class vista extends JFrame {

	private JButton botonJugar=new JButton();
	
	public vista() {
        // Configuración de la ventana
		JPanel panelPrincipal = new JPanel(new GridBagLayout());
        panelPrincipal.setBackground(Color.WHITE);
        
        setTitle("Conecta Pieza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setMinimumSize(new Dimension(400, 400)); // Establecer el tamaño mínimo
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla


        JLabel lblNewLabel = new JLabel("Conecta Pieza");
        lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 44));
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.insets = new Insets(0, 0, 125, 0); // Aumenta el espacio en la parte inferior
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        panelPrincipal.add(lblNewLabel, gbc_lblNewLabel);

        // Crear el botón "Jugar"
        botonJugar = new JButton("Jugar");
        botonJugar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        botonJugar.setPreferredSize(new Dimension(125, 75));  
        botonJugar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 32));
        // Eliminar el fondo del botón
        botonJugar.setBackground(new Color(0, 0, 0, 0));
        botonJugar.setOpaque(false);
        // Desactivar el enfoque pintado en el texto
        botonJugar.setFocusPainted(false); 
        

        // Configurar restricciones para el botón
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1; // Cambiado para colocar el botón después del JLabel

        // Agregar el botón al centro de la pantalla
        panelPrincipal.add(botonJugar, gbc);
        
        add(panelPrincipal);
    }

	public JButton obtenerBotonJugar() {
        return botonJugar;
    }
}