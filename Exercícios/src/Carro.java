package veic;

public class Carro {

    private double velocidadeatual;
    private String placa;
    private String cor;
    private String modelo;
    private String marca;

    public void andar(double distancia) {
        if(velocidadeatual <=0) {
            velocidadeatual=50;
        }
        System.out.println("Estamos andando" + distancia);
    }
    public void frear(double forca) {
        velocidadeatual = 0;
        System.out.println("Estamos parando" + forca);
    }    

    public boolean capotar() {
        return true;
    }
    public double getVelocidadeatual() {
        return velocidadeatual;
    }
    public void setVelocidadeatual(double velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
