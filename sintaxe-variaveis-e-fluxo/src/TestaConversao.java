
public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1270.59;
		int valor = (int) salario;
		System.out.println("A conversao de double para inteiro, " + valor);
		
		//float pontoFlutuante = 3.14f;
		
		//Sobre o extenso de numeros possiveis:
		
		//long numeroGrande = 232131231l;
		//short valorPequeno = 2123;
		//byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("Soma de uns numero double na qual gera uma parada estranha; " + total);
	}
}
