public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int numeroAgencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroAgencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    protected void imprimirInformacoes() {
        System.out.println("CLIENTE: " + cliente.getNome());
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Número da Agência: " + this.numeroAgencia);
        System.out.println("Saldo Total: " + saldo + " reais");
    }

}
