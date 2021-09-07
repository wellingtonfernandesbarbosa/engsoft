import java.util.Scanner;
public class Maior {
	public static void main (String args[]) {
		Scanner entrada = new Scanner(System.in);
	    int i, x=0, valor; //Declaração de variáveis do tipo inteiro(int)
	    for (i=1;i<9;i++) {
	       System.out.printf("\nDigite o %d valor: ",i);
	       valor = entrada.nextInt();
	       if(valor > x) x = valor;
	     } //Teste do maior valor
	     System.out.printf("\nO maior valor digitado é: %d",x); //Impressão do maior valor
	}
}
