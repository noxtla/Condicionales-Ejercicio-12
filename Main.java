/*Determinar si un numero es multiplo de 10*/

package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int nota;
		
		nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota"));
		
		/*if (nota > 7 && nota <10) {
			JOptionPane.showMessageDialog(null, "Sobresaliente");
		}
		
		if (nota > 5 && nota < 7) {
			JOptionPane.showMessageDialog(null, "Notable");
		}
		
		if (nota > 3 && nota < 5) {
			JOptionPane.showMessageDialog(null, "Suficiente");
		}*/
		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4: JOptionPane.showMessageDialog(null, "Insuficiente");
		 	break;
		case 5:
		case 6:
		case 7:JOptionPane.showMessageDialog(null, "Suficiente");
			break;
		case 8:
		case 9:JOptionPane.showMessageDialog(null, "Notable");
		case 10: JOptionPane.showMessageDialog(null, "Sobresaliente");


		default:
			break;
		}
		

	}
}
