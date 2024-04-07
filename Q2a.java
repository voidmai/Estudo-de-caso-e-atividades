import java.util.Scanner;

public class ProgramaCarro {
    private String codigo;
    private String marca;
    private String cor;
    private String modelo;
    private String anoFabricacao;
    private String numPortas;
    private String tipoCombustivel;
    private String quantidadeDisponivel;
    private String preco;
    private String completoOuBasico;

    public void cadastrar(String codigo, String marca, String cor, String modelo, String anoFabricacao, 
                          String numPortas, String tipoCombustivel, String quantidadeDisponivel, 
                          String preco, String completoOuBasico) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completoOuBasico = completoOuBasico;
    }

    public void alterar(String codigo, String marca, String cor, String modelo, String anoFabricacao, 
                        String numPortas, String tipoCombustivel, String quantidadeDisponivel, 
                        String preco, String completoOuBasico) {
        cadastrar(codigo, marca, cor, modelo, anoFabricacao, numPortas, tipoCombustivel, 
                  quantidadeDisponivel, preco, completoOuBasico);
    }

    public void listar() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + numPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println("Preço: " + preco);
        System.out.println("Completo ou Básico: " + completoOuBasico);
    }

    public static void main(String[] args) {
        ProgramaCarro carro = new ProgramaCarro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do carro:");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano de Fabricação: ");
        String anoFabricacao = scanner.nextLine();
        System.out.print("Número de Portas: ");
        String numPortas = scanner.nextLine();
        System.out.print("Tipo de Combustível: ");
        String tipoCombustivel = scanner.nextLine();
        System.out.print("Quantidade Disponível: ");
        String quantidadeDisponivel = scanner.nextLine();
        System.out.print("Preço: ");
        String preco = scanner.nextLine();
        System.out.print("Completo ou Básico: ");
        String completoOuBasico = scanner.nextLine();

        carro.cadastrar(codigo, marca, cor, modelo, anoFabricacao, numPortas, tipoCombustivel, 
                        quantidadeDisponivel, preco, completoOuBasico);

        System.out.println("\nDados do carro cadastrado:");
        carro.listar();
    }
}