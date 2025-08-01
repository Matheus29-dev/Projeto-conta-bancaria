package contas;

import cliente.Cliente;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	public void deposita(double valor) {
		saldo += valor;
	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
