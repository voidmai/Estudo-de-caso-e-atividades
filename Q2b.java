import java.util.Scanner;

public class ProgramaConta {
    private String nomeCorrentista;
    private String rg;
    private String cpf;
    private double saldo;
    private String numero;
    private String agencia;

    public void cadastrar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void alterar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        cadastrar(nomeCorrentista, rg, cpf, saldo, numero, agencia);
    }

    public void imprimirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void listar() {
        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número: " + numero);
        System.out.println("Agência: " + agencia);
    }

    public static void main(String[] args) {
        ProgramaConta conta = new ProgramaConta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados da conta:");
        System.out.print("Nome do Correntista: ");
        String nomeCorrentista = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();

        conta.cadastrar(nomeCorrentista, rg, cpf, saldo, numero, agencia);

        System.out.println("\nDados da conta cadastrada:");
        conta.listar();
    }
}
