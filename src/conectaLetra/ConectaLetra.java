package conectaLetra;

/**
 * @author Jorge Cerrato
 * Fichero que inicia el programa
 */

public class ConectaLetra {

	public static void main(String[] args) {
		modelo mdl = new modelo();
		vista vst = new vista();
		controlador cntrldr = new controlador(mdl,vst);	
		splashScreen splsh = new splashScreen();
		Look lk = new Look(vst);
		cntrldr.iniciarVista();
	}
}
