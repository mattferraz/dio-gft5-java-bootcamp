public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Exibindo informações da conta corrente:");
        super.exibirInformacoesBase();
    }
}
