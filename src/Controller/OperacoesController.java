package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public int Fibonacci(int n) {
		if(n<=1) { //CONDIÇÃO DE PARADA QUANDO N FOR <=1 DEVE RETORNAR 1
			return n;
		} else {
			return Fibonacci(n-1) + Fibonacci(n-2); // CHAMADA DA FUNÇÃO COM O PARAMETRO E N-1 SOAMADA A PROPRIA FUNÇÃO COM PARAMETRO DE N-2		
		}
	}

}
