package contas;

public class CriarConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(5000);
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo() + " dólares");

		Conta segundaConta = new Conta();
		segundaConta.deposita(4000);
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo() + " dólares");

		System.out.println("Confirmando que as contas são diferentes:");
		System.out.println("Primeira conta: " + primeiraConta);
		System.out.println("Segunda conta: " + segundaConta);
	}
}
