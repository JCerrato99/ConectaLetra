package conectaLetra;

/**
 * @author Jorge Cerrato
 * Fichero que inicia el programa
 */

public class ConectaLetra {

	public static void main(String[] args) {
		Modelo mdl = new Modelo();
		Vista vst = new Vista();
		Controlador cntrldr = new Controlador(mdl,vst);	
		SplashScreen splsh = new SplashScreen();
		Look lk = new Look(vst);
		cntrldr.iniciarVista();
	}
}
