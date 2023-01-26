
public class TestaPontoFlutuante {
	public static void main (String[] args) {
		double salario;
		salario = 1333.80;
		System.out.println("Meu salário é " + salario);
		
		double divisao = 1.14 / 2;
		System.out.println("A divisaão é de: "+ divisao);
		
		int divisaoPaia = 5 / 2;
		System.out.println("Divisao paia na qual o java ele ignora valor quebrado numa divisao de inteiro e retorna como inteiro: " + divisaoPaia);
		
		double divisaoOk = 5.0 / 2;
		System.out.println("Aqui a divisão acontece geralmente assim, o java pegar o maior valor no caso o quebrado  considera o resultado: " + divisaoOk);
		
	}
}
