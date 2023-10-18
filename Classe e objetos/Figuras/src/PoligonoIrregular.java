public class PoligonoIrregular extends Figura {
    private double[] lados;

    public PoligonoIrregular(String nome, int numeroLados, double lados) {
        super(nome);
        this.lados = lados;
        this.numeroLados = numeroLados;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 0;
        for (double lado : lados) {
            perimetro += lado;
        }
    }
}