public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Exibindo informações da conta poupança:");
        super.exibirInformacoesBase();
    }
}
