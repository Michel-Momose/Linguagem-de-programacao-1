public class elipse extends Figura {
    private double semieixoMaior;
    private double semieixoMenor;

    public elipse(String nome, String cor, double semieixoMaior, double semieixoMenor) {
        super(nome);
        this.semieixoMaior = semieixoMaior;
        this.semieixoMenor = semieixoMenor;
    }

    public void calcularPerimetro() {
        double a = semieixoMaior;
        double b = semieixoMenor;
        double h = Math.pow((a - b) / (a + b), 2);
        double perimetro = Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    public void calcularArea(double semieixoMaior, double semieixoMenor) {
        area = Math.PI * semieixoMaior * semieixoMenor;
    }
}