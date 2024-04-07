import java.util.Scanner;

public class ProgramaAnimal {
    private String especie;
    private String dataNascimento;
    private String nome;
    private String numeroRegistro;
    private String localNascimento;

    public void cadastrar(String especie, String dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterar(String especie, String dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        cadastrar(especie, dataNascimento, nome, numeroRegistro, localNascimento);
    }

    public void imprimir() {
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }

    public static void main(String[] args) {
        ProgramaAnimal animal = new ProgramaAnimal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do animal:");
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Número de Registro: ");
        String numeroRegistro = scanner.nextLine();
        System.out.print("Local de Nascimento: ");
        String localNascimento = scanner.nextLine();

        animal.cadastrar(especie, dataNascimento, nome, numeroRegistro, localNascimento);

        System.out.println("\nDados do animal cadastrado:");
        animal.imprimir();
    }
}