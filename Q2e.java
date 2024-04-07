import java.util.Scanner;

public class ProgramaFuncionario {
    private String nome;
    private String dataNascimento;
    private String rg;
    private String cpf;
    private String endereco;
    private String naturalidade;
    private double salario;
    private String profissao;
    private String grauInstrucao;
    private String matricula;

    public void cadastrar(String nome, String dataNascimento, String rg, String cpf, String endereco,
                          String naturalidade, double salario, String profissao, String grauInstrucao,
                          String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void alterar(String nome, String dataNascimento, String rg, String cpf, String endereco,
                        String naturalidade, double salario, String profissao, String grauInstrucao,
                        String matricula) {
        cadastrar(nome, dataNascimento, rg, cpf, endereco, naturalidade, salario, profissao, grauInstrucao, matricula);
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: " + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        ProgramaFuncionario funcionario = new ProgramaFuncionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do funcionário:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Naturalidade: ");
        String naturalidade = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Profissão: ");
        String profissao = scanner.nextLine();
        System.out.print("Grau de Instrução: ");
        String grauInstrucao = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        funcionario.cadastrar(nome, dataNascimento, rg, cpf, endereco, naturalidade, salario, profissao, grauInstrucao, matricula);

        System.out.println("\nDados do funcionário cadastrado:");
        funcionario.imprimirDados();
    }
}