public class Carro {
    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;

    private boolean ligado;

    public Carro(String modelo, double velocidade, double aceleracao, int marcha) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar(double quantidade) {
        if (ligado) {
            velocidade += quantidade * aceleracao;
            System.out.println("O carro acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void desacelerar(double quantidade) {
        if (ligado) {
            velocidade -= quantidade * aceleracao;
            System.out.println("O carro desacelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("O carro precisa estar ligado para desacelerar.");
        }
    }

    public void marchaParaCima() {
        if (marcha < 6) {
            marcha++;
            System.out.println("Marcha aumentada para " + marcha);
        } else {
            System.out.println("Marcha já está na posição máxima.");
        }
    }

    public void marchaParaBaixo() {
        if (marcha > 0) {
            marcha--;
            System.out.println("Marcha diminuída para " + marcha);
        } else {
            System.out.println("Marcha já está na posição mínima.");
        }
    }

    public void virarDireita() {
        System.out.println("O carro virou à direita.");
    }

    public void virarEsquerda() {
        System.out.println("O carro virou à esquerda.");
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 0, 10, 0);

        carro.ligar();
        carro.acelerar(1);
        carro.marchaParaCima();
        carro.virarDireita();
        carro.desligar();
    }
}
