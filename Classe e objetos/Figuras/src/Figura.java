public abstract class Figura {
    protected String nome;
    protected double area;
    protected double perimetro;

    public Figura(String nome) {
        this.nome = nome;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetro();

    public String getNome() {
        return nome;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
