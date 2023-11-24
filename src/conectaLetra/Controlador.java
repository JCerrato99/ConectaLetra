package conectaLetra;
import javax.swing.JFrame;

public class Controlador  {

	 private Modelo mi_modelo;
	 private Vista mi_vista;
	 
	 public Controlador(Modelo mi_modelo, Vista mi_vista) {
	  this.mi_modelo = mi_modelo;
	  this.mi_vista = mi_vista;
	 }
	 
	 public void iniciarVista() {
	  mi_vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  mi_vista.setLocationRelativeTo(null);
	  mi_vista.setVisible(true);  
	 }
}