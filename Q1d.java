//Sabendo que um Professor para o sistema de cadastro da Faculdade XPTO possui as seguintes características: nome, titulação, formação, carga horária, salário e uma descrição das disciplinas que professor pode ensinar. O Professor possui os seguintes comportamentos: (i) cadastrar e alterar que recebem como parâmetro as características do Professor; (ii) alterar a descrição de disciplina ensinada; (iii) Imprimir dados do Professor.
public class Professor{
    private String nome;
    private String titulacao;
    private String formacao;
    private String cargaHoraria;
    private String salario;
    private String descricaoDisciplinas;
    public void cadastrar(String nome, String titulacao, String formacao, String cargaHoraria, String salario, String descricaoDisciplinas){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }
    public void alterar(String nome, String titulacao, String formacao, String cargaHoraria, String salario, String descricaoDisciplinas){
        cadastrar(nome, titulacao, formacao, cargaHoraria, salario, descricaoDisciplinas);
    }
    public void alterarDescricaoDisciplinas(String descricaoDisciplinas){
        this.descricaoDisciplinas = descricaoDisciplinas;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Salário: " + salario);
        System.out.println("Descrição das Disciplinas: " + descricaoDisciplinas);
    }
    public static void main(String[] args){
        Professor professor = new Professor();
        professor.cadastrar("João", "Doutor", "Engenharia", "8 horas", "R$5000", "Programação, Matemática, Física");
        professor.alterar("Maria", "Mestrado", "Ciência da Computação", "10 horas", "R$6000", "Programação, Matemática, Física");
        professor.alterarDescricaoDisciplinas("Programação, Matemática, Física");
        professor.imprimir();
    }
}