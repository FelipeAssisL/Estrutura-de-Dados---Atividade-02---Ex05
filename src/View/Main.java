package View;
import java.util.Scanner;
import Controller.OperacoesController;


public class Main {

	public static void main(String[] args) {
		OperacoesController OC = new OperacoesController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int n = sc.nextInt();
		while(n > 20) {
			System.out.print("Digite um entre 0 e 20: ");
			 n = sc.nextInt();
		}
		int fib = OC.Fibonacci(n);
		
		sc.close();
		
		System.out.println("O valor na "+ n +"º posição da sequência de Fibonacci é: "+fib);

	}

}
