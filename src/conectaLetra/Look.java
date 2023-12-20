package conectaLetra;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;

public class Look {

    public static void applyStyles(JFrame frame,JPanel panel, JButton button) {
        // Estilos para la ventana principal
        frame.setTitle("Conecta Pieza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setLocationRelativeTo(null);

        // Estilos para la etiqueta "Conecta Pieza"
        JLabel label1 = new JLabel("Conecta Pieza");
        label1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 44));
        GridBagConstraints gbc_label1 = new GridBagConstraints();
        gbc_label1.insets = new Insets(0, 0, 75, 0);
        gbc_label1.gridx = 0;
        gbc_label1.gridy = 0;

        // Estilos para el botón "Jugar"
        button.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        button.setPreferredSize(new Dimension(125, 75));
        button.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 32));
        button.setBackground(new Color(0, 0, 0, 0));
        button.setOpaque(false);
        button.setFocusPainted(false);
        GridBagConstraints gbc_button = new GridBagConstraints();
        gbc_button.gridx = 0;
        gbc_button.gridy = 1;

        // Estilos para el panel principal
        panel.add(label1, gbc_label1);
        panel.add(button, gbc_button);

        frame.add(panel);
    }

    public static void applyStyles(JPanel panel, JButton... buttons) {
        // Estilos para el panel de juego
        panel.setBackground(Color.WHITE);

        // Estilos para la etiqueta "Seleccione una pieza"
        JLabel label = new JLabel("Seleccione una pieza");
        label.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 34));
        GridBagConstraints gbc_label2 = new GridBagConstraints();
        gbc_label2.insets = new Insets(0, 0, 75, 0);
        gbc_label2.gridx = 0;
        gbc_label2.gridy = 0;
        panel.add(label, gbc_label2);

        // Estilos para el panel de piezas
        JPanel panelPiezas = new JPanel(new GridBagLayout());
        panelPiezas.setBackground(Color.WHITE);
        GridBagConstraints gbc_panelPiezas = new GridBagConstraints();
        gbc_panelPiezas.gridx = 0;
        gbc_panelPiezas.gridy = 1;

        // Estilos para los botones en el panel de piezas
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setIcon(new ImageIcon(Vista.class.getResource("/imagenes/" + getImageFileName(i) + ".png")));
            buttons[i].setBackground(new Color(0, 0, 0, 0));
            buttons[i].setOpaque(false);
            buttons[i].setBorderPainted(false);
            buttons[i].setFocusPainted(false);
            buttons[i].setUI(new BasicButtonUI());
            
            panelPiezas.add(buttons[i], posicionfoto(i));
        }
        panel.add(panelPiezas, gbc_panelPiezas);

    }
    
    private static String getImageFileName(int index) {
        switch (index) {
            case 0:
                return "cubo";
            case 1:
                return "l";
            case 2:
                return "t";
            case 3:
                return "linea";
            default:
                return "";
        }
    }
    
    private static GridBagConstraints posicionfoto(int index) {
    	 switch (index) {
         case 0:
        	 GridBagConstraints gbc_foto1 = new GridBagConstraints();
        	 gbc_foto1.gridx = 0;
        	 gbc_foto1.gridy = 0;
        	 return gbc_foto1;
         case 1:
        	 GridBagConstraints gbc_foto2 = new GridBagConstraints();
        	 gbc_foto2.gridx = 0;
        	 gbc_foto2.gridy = 1;
        	 return gbc_foto2;

         case 2:
        	 GridBagConstraints gbc_foto3 = new GridBagConstraints();
        	 gbc_foto3.gridx = 1;
        	 gbc_foto3.gridy = 0;
        	 return gbc_foto3;

         case 3:
        	 GridBagConstraints gbc_foto4 = new GridBagConstraints();
        	 gbc_foto4.gridx = 1;
        	 gbc_foto4.gridy = 1;
        	 return gbc_foto4;

         default:
        	 GridBagConstraints gbc_foto5 = new GridBagConstraints();
        	 gbc_foto5.gridx = 0;
        	 gbc_foto5.gridy = 0;
        	 return gbc_foto5;
    	 }
    	
    }
}
