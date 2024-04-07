public class Funcionario {
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
        Funcionario funcionario = new Funcionario();
        funcionario.cadastrar("João Silva", "01/01/1990", "1234567", "123.456.789-00", "Rua A, 123", 
                              "São Paulo", 3000.00, "Programador", "Superior Completo", "0001");
        funcionario.alterar("Maria Souza", "15/05/1985", "9876543", "987.654.321-00", "Rua B, 456", 
                            "Rio de Janeiro", 3500.00, "Analista", "Pós-graduação", "0002");
        funcionario.imprimirDados();
    }
}
