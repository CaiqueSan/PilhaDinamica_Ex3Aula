package controller;

public class FatController {
	
	public long fatorial(int n) throws Exception {
		Pilha p = new Pilha();
		while (n > 0) {
			p.push(n);
			n --;
		}
		long fat = p.pop();
		while (p.tamanho() > 0) {
			fat = fat * p.pop();
		}
		return fat;
	}
}
