
package teste;

public class TesteContas {

	public static void main(String[] args) throws modelo.SaldoInsuficienteException {
		
		// Full Qualified Name FQn
		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 111);
		cc.deposita(100.0);

		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo Cotra Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
	}

}
