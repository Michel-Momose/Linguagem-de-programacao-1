public class Circulo extends Figura {
    private double raio;

    public Circulo(String nome, double raio) {
    super(nome);
    this.raio = raio;
    }

    public void calcularArea(){
        area = Math.PI * raio * raio;
    }
    
    public void calcularPerimetro(){
        perimetro = 2 * Math.PI * raio;
    }

} 
