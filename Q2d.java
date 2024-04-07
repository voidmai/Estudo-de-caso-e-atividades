import java.util.Scanner;

public class ProgramaProfessor {
    private String nome;
    private String titulacao;
    private String formacao;
    private String cargaHoraria;
    private String salario;
    private String descricaoDisciplinas;

    public void cadastrar(String nome, String titulacao, String formacao, String cargaHoraria, String salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void alterar(String nome, String titulacao, String formacao, String cargaHoraria, String salario, String descricaoDisciplinas) {
        cadastrar(nome, titulacao, formacao, cargaHoraria, salario, descricaoDisciplinas);
    }

    public void alterarDescricaoDisciplinas(String descricaoDisciplinas) {
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Salário: " + salario);
        System.out.println("Descrição das Disciplinas: " + descricaoDisciplinas);
    }

    public static void main(String[] args) {
        ProgramaProfessor professor = new ProgramaProfessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do professor:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Titulação: ");
        String titulacao = scanner.nextLine();
        System.out.print("Formação: ");
        String formacao = scanner.nextLine();
        System.out.print("Carga Horária: ");
        String cargaHoraria = scanner.nextLine();
        System.out.print("Salário: ");
        String salario = scanner.nextLine();
        System.out.print("Descrição das Disciplinas: ");
        String descricaoDisciplinas = scanner.nextLine();

        professor.cadastrar(nome, titulacao, formacao, cargaHoraria, salario, descricaoDisciplinas);

        System.out.println("\nDados do professor cadastrado:");
        professor.imprimir();
    }
}