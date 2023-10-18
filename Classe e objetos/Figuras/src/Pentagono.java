public class Pentagono extends Figura {
    private double lado;

    public Pentagono(String nome, String cor, double lado) {
        super(nome);
        this.lado = lado;
    }

    public void calcularPerimetro() {
        perimetro = 5 * lado;
    }
    
    public void calcularArea() {
        double numerador = 5 * Math.pow(lado, 2);
        double denominador = 4 * Math.tan(Math.PI / 5);
        area = numerador / denominador;
    }

    
}