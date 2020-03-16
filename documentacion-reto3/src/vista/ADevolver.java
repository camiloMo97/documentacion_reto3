package vista;

/**
 * Clase donde se hace su respectivo calculo para la devolucion del dinero
 * @author usario
 *
 */
public class ADevolver {
	
	/**
	 * Metodo que devuelve el dinero que a metido de mas
	 * @param Recibe lo que debemos devolver
	 * @return devuelve la cantidad de dinero que sobra
	 */
	public static String adevolver(float restante) {
		//Función para la devolución exacta de dinero al cliente, calculando la cantidad de billetes y monedas
		
		restante = Math.round(restante * 100) / 100f;
		float totaldevolver = 0;
		String devolver="Te sobra " + restante + "€ \n \n";
		int bmdevolver = 0;
		if (restante != 0) {

			if (restante >= 200f) {
				totaldevolver = restante / 200;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 200;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 200€ \n");
			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 100f) {
				totaldevolver = restante / 100;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 100;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 100€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 50f) {
				totaldevolver = restante / 50;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 50;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 50€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 20f) {
				totaldevolver = restante / 20;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 20;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 20€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 10f) {
				totaldevolver = restante / 10;
				totaldevolver = (float) (Math.floor(totaldevolver));
				bmdevolver = (int) totaldevolver;
				restante = restante % 10;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 10€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 5f) {
				totaldevolver = restante / 5;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 5;
				devolver = devolver + ("Devolver " + bmdevolver + " billete(s) de 5€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 2f) {
				totaldevolver = restante / 2;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 2;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 2€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 1f) {
				totaldevolver = restante / 1;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 1;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 1€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 0.50f) {
				totaldevolver = restante / 0.50f;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 0.50f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.50€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 0.20f) {
				totaldevolver = restante / 0.20f;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 0.20f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.20€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 0.10f) {
				totaldevolver = restante / 0.10f;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 0.10f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.10€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 0.05f) {
				totaldevolver = restante / 0.05f;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 0.05f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.05€ \n");
			}
			restante = Math.round(restante * 100) / 100f;
			if (restante >= 0.02f) {
				totaldevolver = restante / 0.02f;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante = restante % 0.02f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.02€ \n");

			}
			restante = Math.round(restante * 100) / 100f;
			
			if (restante >= 0.01f) {
				totaldevolver = restante / 0.01f;
				totaldevolver = (float) (Math.floor(totaldevolver*1)/1);
				bmdevolver = (int) totaldevolver;
				restante =  restante % 0.01f;
				devolver = devolver + ("Devolver " + bmdevolver + " moneda(s) de 0.01€ \n");

			}


		} else{
			devolver = "Gracias por su compra, retire sus productos dandole a continuar";
		}

		return devolver;

	}

}