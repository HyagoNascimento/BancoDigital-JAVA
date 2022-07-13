package test;

public class App {
    
   
	public static void main(String[] args) {
		Cliente hyago = new Cliente();
		hyago.setNome("Hyago Henrique Nascimento");
		
		Conta cc = new ContaCorrente(hyago);
		Conta poupanca = new ContaPoupanca(hyago);
		
		//Depositando valor na conta corrente
		cc.depositar(1500);
		
		//Transferindo valor depositado para poupança
		cc.transferir(300, poupanca);
		
		//Imprimindo Extrato Conta Corrente
		cc.imprimirExtrato();
		
		//Imprimindo Extrato Conta Poupança
		poupanca.imprimirExtrato();


	}

}
