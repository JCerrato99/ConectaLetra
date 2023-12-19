package conectaLetra;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;
/**
 * Fichero con la vista del programa
 */
public class Vista extends JFrame {

	private JButton botonJugar=new JButton();
    JPanel panelElegirPiezas=new JPanel(new GridBagLayout());
	JPanel panelPrincipal = new JPanel(new GridBagLayout());

	public Vista() {
        ///////////////////////////////////////////////// VENTANA PRINCIPAL ///////////////////////////////////////////////////////////////////////////////////////
        
        setTitle("Conecta Pieza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setMinimumSize(new Dimension(400, 400)); // Establecer el tamaño mínimo
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla


        JLabel lblNewLabel1 = new JLabel("Conecta Pieza");
        lblNewLabel1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 44));
        GridBagConstraints gbc_lblNewLabel1 = new GridBagConstraints();
        gbc_lblNewLabel1.insets = new Insets(0, 0, 75, 0); // Aumenta el espacio en la parte inferior
        gbc_lblNewLabel1.gridx = 0;
        gbc_lblNewLabel1.gridy = 0;
        panelPrincipal.add(lblNewLabel1, gbc_lblNewLabel1);

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
        
        
        ////////////////////////////////////////////////////////PANEL DE JUEGO/////////////////////////////////////////////////////////////////////////////////////////////////////
        
        panelElegirPiezas.setBackground(Color.WHITE);

        JLabel lblNewLabel2 = new JLabel("Seleccione una pieza");
        lblNewLabel2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 34));
        GridBagConstraints gbc_lblNewLabel2 = new GridBagConstraints();
        gbc_lblNewLabel2.insets = new Insets(0, 0, 75, 0); // Aumenta el espacio en la parte inferior
        gbc_lblNewLabel2.gridx = 0;
        gbc_lblNewLabel2.gridy = 0;
        panelElegirPiezas.add(lblNewLabel2, gbc_lblNewLabel2);
        
        
        /////////////////////////////////////////////////////////PANEL PIEZAS////////////////////////////////////////////////////////////
        
        JPanel panelPiezas=new JPanel(new GridBagLayout());
        panelPiezas.setBackground(Color.WHITE);
        GridBagConstraints gbcpanel = new GridBagConstraints();
        gbcpanel.gridx = 0;
        gbcpanel.gridy = 1;
        panelElegirPiezas.add(panelPiezas,gbcpanel);
        
        //Creo una etiqueta con la imagen en el centro
        JButton foto1 = new JButton();
        //Indico la imagen que quiero mostrar en la label
        foto1.setIcon(new ImageIcon(SplashScreen.class.getResource("/imagenes/cubo.png")));
        foto1.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbcfoto1 = new GridBagConstraints();
        gbcfoto1.insets = new Insets(0, 20, 20, 0); 
        gbcfoto1.gridx = 0;
        gbcfoto1.gridy = 0;
        foto1.setBackground(new Color(0, 0, 0, 0));
        foto1.setOpaque(false);
        foto1.setBorderPainted(false);
        foto1.setFocusPainted(false);
        foto1.setUI(new BasicButtonUI());
        panelPiezas.add(foto1,gbcfoto1);
        
        //Creo una etiqueta con la imagen en el centro
        JButton foto2 = new JButton();
        //Indico la imagen que quiero mostrar en la label
        foto2.setIcon(new ImageIcon(SplashScreen.class.getResource("/imagenes/l.png")));
        foto2.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbcfoto2 = new GridBagConstraints();
        gbcfoto2.insets = new Insets(0, 20, 20, 0); // Aumenta el espacio en la parte inferior
        gbcfoto2.gridx = 1;
        gbcfoto2.gridy = 0;
        foto2.setBackground(new Color(0, 0, 0, 0));
        foto2.setOpaque(false);
        foto2.setBorderPainted(false);
        foto2.setFocusPainted(false);
        foto2.setUI(new BasicButtonUI());
        panelPiezas.add(foto2,gbcfoto2);
        
        //Creo una etiqueta con la imagen en el centro
        JButton foto3 = new JButton();
        //Indico la imagen que quiero mostrar en la label
        foto3.setIcon(new ImageIcon(SplashScreen.class.getResource("/imagenes/t.png")));
        foto3.setHorizontalAlignment(SwingConstants.CENTER);
        foto3.setVerticalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbcfoto3 = new GridBagConstraints();
        gbcfoto3.insets = new Insets(0, 20, 20, 0); // Aumenta el espacio en la parte inferior
        gbcfoto3.gridx = 0;
        gbcfoto3.gridy = 1;
        foto3.setBackground(new Color(0, 0, 0, 0));
        foto3.setOpaque(false);
        foto3.setBorderPainted(false);
        foto3.setFocusPainted(false);
        foto3.setUI(new BasicButtonUI());
        panelPiezas.add(foto3,gbcfoto3);
        
        //Creo una etiqueta con la imagen en el centro
        JButton foto4 = new JButton();
        //Indico la imagen que quiero mostrar en la label
        foto4.setIcon(new ImageIcon(SplashScreen.class.getResource("/imagenes/linea.png")));
        foto4.setHorizontalAlignment(SwingConstants.CENTER);
        foto4.setVerticalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbcfoto4 = new GridBagConstraints();
        gbcfoto4.insets = new Insets(0, 20, 20, 0); // Aumenta el espacio en la parte inferior
        gbcfoto4.gridx = 1;
        gbcfoto4.gridy = 1;
        foto4.setBackground(new Color(0, 0, 0, 0));
        foto4.setOpaque(false);
        foto4.setBorderPainted(false);
        foto4.setFocusPainted(false);
        foto4.setUI(new BasicButtonUI());
        panelPiezas.add(foto4,gbcfoto4);
        
    }

	public JButton obtenerBotonJugar() {
        return botonJugar;
    }
}