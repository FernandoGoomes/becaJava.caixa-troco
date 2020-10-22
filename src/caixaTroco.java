import java.util.Scanner;

public class caixaTroco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		double conta, pago, troco;
		int op = 0;

		do {
			System.out.printf("Informe o Valor da Conta: ");
			conta = ler.nextDouble();

			System.out.printf("Informe o Valor Pago....: ");
			pago = ler.nextDouble();

			if (pago < conta) {
				System.out.println("Pagamento insuficiente");
			}

			else {
				troco = (pago - conta);

				if (troco == 0) {
					System.out.println("Você não tem troco.");
				}

				else {
					System.out.println("Seu troco é R$ " + troco);
				}
			}
			System.out.println("Aperte 0 para encerrar, qualquer numero para voltar");
			op = ler.nextInt();
		} while (op != 0);
	}
}
