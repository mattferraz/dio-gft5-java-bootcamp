public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int CURRENT_NUMERO = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente) {
        agencia = AGENCIA_PADRAO;
        numero = CURRENT_NUMERO++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void exibirInformacoesBase() {
        System.out.println("-".repeat(40));

        System.out.println("Cliente: " + cliente.getName());
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.printf("Saldo: %.2f\n", saldo);
        
        System.out.println("-".repeat(40));
    }
}
