package view;

import javax.swing.JOptionPane;
import controller.FatController;

public class Principal {
	
	public static void main (String args [] ) throws Exception {
		int a = 0;
		while (a < 1 || a > 20) {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 1 a 20:"));
		}
		FatController f = new FatController();
		System.out.println(f.fatorial(a));
	}
}
