public class Trapezio extends Figura {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(String nome, double baseMaior, double baseMenor, double altura) {
        super(nome);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = baseMaior + baseMenor + 2 * lado;
    }

    @Override
    public void calcularArea() {
        area = ((baseMaior + baseMenor) * altura) / 2;
    }
}