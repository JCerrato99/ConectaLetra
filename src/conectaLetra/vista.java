package conectaLetra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class vista extends JFrame{
	
	
	public vista() {
        // Configuración de la ventana
        setTitle("Pantalla de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setMinimumSize(new Dimension(400, 400)); // Establecer el tamaño mínimo
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Configuración del diseño
        getContentPane().setLayout(new GridBagLayout());

        JLabel lblNewLabel = new JLabel("Conecta Pieza");
        lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 44));
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.insets = new Insets(0, 0, 125, 0); // Aumenta el espacio en la parte inferior
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        getContentPane().add(lblNewLabel, gbc_lblNewLabel);

        // Crear el botón "Jugar"
        JButton botonJugar = new JButton("Jugar");
        botonJugar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        botonJugar.setPreferredSize(new Dimension(125, 75));  
        botonJugar.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 32));
        // Eliminar el fondo del botón
        botonJugar.setBackground(new Color(0, 0, 0, 0));
        botonJugar.setOpaque(false);
        // Desactivar el enfoque pintado en el texto
        botonJugar.setFocusPainted(false); 
        
        
        // Agregar un ActionListener al botón
        botonJugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la lógica que se ejecutará cuando se presione el botón
                JOptionPane.showMessageDialog(vista.this, "¡Has presionado el botón Jugar!");
            }
        });

        // Configurar restricciones para el botón
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1; // Cambiado para colocar el botón después del JLabel

        // Agregar el botón al centro de la pantalla
        getContentPane().add(botonJugar, gbc);
    }
	
}
