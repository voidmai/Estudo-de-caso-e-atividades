public class ContaPoupanca{
    private String nomeCorrentista;
    private String rg;
    private String cpf;
    private double saldo;
    private String numero;
    private String agencia;
  
    public void cadastrar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia){
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }
    public void alterar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia){
        cadastrar(nomeCorrentista, rg, cpf, saldo, numero, agencia);
    }
    
    public void imprimirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    
    public void listar(){
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
    }
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca();
        conta.cadastrar("João", "123456789", "987654321", 1000.0, "12345", "1234");
        conta.alterar("Maria", "987654321", "876543210", 2000.0, "67890", "5678");
        conta.imprimirSaldo();
        conta.listar();
    }
}