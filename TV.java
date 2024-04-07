public class TV{
    private double tamanhoTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public TV(double tamanhoTela, int volume, String marca, int voltagem, int canal) {
        this.tamanhoTela = tamanhoTela;
        this.volume = volume;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
    }

    public void ligar() {
        System.out.println("O consumo da televisão é de " + (voltagem * tamanhoTela) + " Watts.");
    }

    public void desligar() {
        System.out.println("A televisão foi desligada.");
    }
    public void aumentarVolume(){
        if(volume < 10){
            volume++;
            System.out.println("Volume aumentado para " + volume);
        }else{
            System.out.println("Volume já está no máximo.");
        }
    }
    public void diminuirVolume(){
        if(volume > 0){
            volume--;
            System.out.println("Volume diminuido para " + volume);
        }else{
            System.out.println("Volume já está no mínimo.");
        }
    }
    public void subirCanal(){
        if(canal < 99){
            canal++;
            System.out.println("Canal subiu para " + canal);
        }else{
            System.out.println("Canal já está no máximo.");
        }
    }
    public void descerCanal(){
        if(canal > 1){
            canal--;
            System.out.println("Canal desceu para " + canal);
        }else{
            System.out.println("Canal já está no mínimo.");
        }
    }
    public static void main(String[] args){
        TV tv = new TV(55, 5, "Samsung", 220, 1);
        tv.ligar();
        tv.aumentarVolume();
        tv.subirCanal();
        tv.desligar();
    }
}