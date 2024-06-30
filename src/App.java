public class App {
    public static void main(String[] args) throws Exception {
        Cliente jonas = new Cliente();
        jonas.setNome("Jonas");


        Conta cc = new ContaCorrente(jonas);
        Conta poupanca = new ContaPoupanca(jonas);

        cc.depositar(50);
        cc.tranferir(50, poupanca);

        cc.imprimirInformacoes();

        System.out.println("##############################");
        
        poupanca.imprimirInformacoes();
    }
}
