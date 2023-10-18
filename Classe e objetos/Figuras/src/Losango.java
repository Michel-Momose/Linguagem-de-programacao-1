public class Losango extends Figura {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(String nome, double diagonalMaior, double diagonalMenor) {
        super(nome);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * (diagonalMaior + diagonalMenor);
    }
    
    public void calcularArea() {
        area = (diagonalMaior * diagonalMenor) / 2;
    }
}