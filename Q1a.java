// Altere o programa abaixo para permitir a customização de dados pelo usuário.
public class Carro {
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
        Carro carro = new Carro();
        carro.cadastrar("1", "Fiat", "Vermelho", "Uno", "2012", "4", "Gasolina", "10", "R$50.000", "Completo");
        carro.alterar("2", "Fiat", "Vermelho", "Uno", "2012", "4", "Gasolina", "10", "R$50.000", "Completo");
        carro.listar();
    }
}
