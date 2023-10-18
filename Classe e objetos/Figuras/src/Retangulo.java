public class Retangulo extends Figura{
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    public void calcularArea() {
        area = largura * altura;
    }
     public void calcularPerimetro() {
        perimetro = 2 * (largura + altura);
     }
}
