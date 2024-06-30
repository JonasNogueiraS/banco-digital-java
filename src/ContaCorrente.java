public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirInfos() {
        System.out.println("Informações do Cliente: ");
        super.imprimirInformacoes();
    }
}
