package conectaLetra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class controlador  {

	 private modelo miModelo;
	 private vista miVista;
	 
	 public controlador(modelo miModelo, vista miVista) {
	  this.miModelo = miModelo;
	  this.miVista = miVista;
	  JButton botonJugar = miVista.obtenerBotonJugar();
	  JPanel panelJuego= miVista.panelElegirPiezas;
	  JPanel panelPrincipal= miVista.panelPrincipal;
	  
	  miVista.obtenerBotonJugar().addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	             // Lógica para manejar el evento de clic en el botón Jugar
	        	 miVista.add(panelJuego);
	        	 miVista.panelPrincipal.setVisible(false);
	         }
	     });
	  
	 }
	 
	
	 
	 public void iniciarVista() {
	  miVista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  miVista.setLocationRelativeTo(null);
	  miVista.setVisible(true);  
	 }
	 
	 
	 

}