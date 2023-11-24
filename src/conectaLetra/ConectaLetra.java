package conectaLetra;


public class ConectaLetra {

	public static void main(String[] args) {
		Modelo mdl = new Modelo();
		Vista vst = new Vista();
		Controlador cntrldr = new Controlador(mdl,vst);	
		SplashScreen splsh = new SplashScreen();
		cntrldr.iniciarVista();
	}
}
