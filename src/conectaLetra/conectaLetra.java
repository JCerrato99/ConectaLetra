package conectaLetra;


public class conectaLetra {

	public static void main(String[] args) {
		modelo mdl = new modelo();
		vista vst = new vista();
		controlador cntrldr = new controlador(mdl,vst);	
		splashScreen splsh = new splashScreen();
		cntrldr.iniciarVista();
	}
}
