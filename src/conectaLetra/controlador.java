package conectaLetra;
import javax.swing.JFrame;

public class controlador  {

	 private modelo miModelo;
	 private vista miVista;
	 
	 public controlador(modelo miModelo, vista miVista) {
	  this.miModelo = miModelo;
	  this.miVista = miVista;
	 }
	 
	 public void iniciarVista() {
	  miVista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  miVista.setLocationRelativeTo(null);
	  miVista.setVisible(true);  
	 }
}