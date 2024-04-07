public class Animal{
    private String especie;
    private String dataNascimento;
    private String nome;
    private String numeroRegistro;
    private String localNascimento;

    public void cadastrar(String especie, String dataNascimento, String nome, String numeroRegistro, String localNascimento){
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }
    public void alterar(String especie, String dataNascimento, String nome, String numeroRegistro, String localNascimento){
        cadastrar(especie, dataNascimento, nome, numeroRegistro, localNascimento);
    }
    public void imprimir(){
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.cadastrar("Cachorro", "01/01/2020", "Rex", "12345", "São Paulo");
        animal.alterar("Gato", "02/02/2020", "Miau", "67890", "Rio de Janeiro");
        animal.imprimir();
    }
}
