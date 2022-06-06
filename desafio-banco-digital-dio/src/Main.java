public class Main {
    public static void main(String[] args) {
        Cliente mateus = new Cliente("Mateus");

        Conta corrente = new ContaCorrente(mateus);
        Conta poupanca = new ContaPoupanca(mateus);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.exibirInformacoes();
        poupanca.exibirInformacoes();
    }
}
