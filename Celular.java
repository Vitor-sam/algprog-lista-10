public class Celular {

    String marca;
    String modelo;
    int memoria;
    int bateria;

    public Celular(String marca, String modelo, int memoria, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void desligar() {
        System.out.println("Celular desligado.");
    }

    public void fazerLigacao() {
        System.out.println("Realizando ligação...");
    }

    public void tirarFoto() {
        System.out.println("Foto tirada.");
    }

    public void carregar() {
        bateria = 100;
        System.out.println("Celular carregado.");
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memória: " + memoria + " GB");
        System.out.println("Bateria: " + bateria + "%");
    }
}
