public class TesteFiguras {
    public static void main(String[] args){
        Circulo circulo = new Circulo("Circulo", 5.0);
        Retangulo retangulo = new Retangulo("Retângulo", 4.0, 6.0);
        Triangulo triangulo = new Triangulo("Triângulo", 3.0, 4.0, 5.0);

        circulo.calcularArea();
        circulo.calcularPerimetro();

        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        System.out.println("Nome: " + circulo.getNome());
        System.out.println("Area: " + circulo.getArea());
        System.out.println("Perimetro: " + circulo.getPerimetro());
        
        System.out.println("Nome: " + retangulo.getNome());
        System.out.println("Area: " + retangulo.getArea());
        System.out.println("Perimetro: " + retangulo.getPerimetro());

        System.out.println("Nome: " + triangulo.getNome());
        System.out.println("Area: " + triangulo.getArea());
        System.out.println("Perimetro: " + triangulo.getPerimetro());
    }
    
}
