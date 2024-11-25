public class Teste {
    public static void main(String[] args) {
        // Instanciando pontos do quadrado
        Ponto2D p0Q = new Ponto2D(2, 2);
        Ponto2D p1Q = new Ponto2D(4, 2);
        Ponto2D p2Q = new Ponto2D(4, 4);
        Ponto2D p3Q = new Ponto2D(2, 4);

        Ponto2D[] pontosQ = {p0Q, p1Q, p2Q, p3Q};

        Forma quadrado = Forma.gerarForma(pontosQ);

        // Instanciando pontos do triangulo (equilatero)
        Ponto2D p0TEq = new Ponto2D(0, 0);
        Ponto2D p1TEq = new Ponto2D(3, 0); 
        Ponto2D p2TEq = new Ponto2D(1.5, Math.sqrt(3) * 1.5);

        Ponto2D[] pontosTEq = {p0TEq, p1TEq, p2TEq};

        Forma trianguloEq = Forma.gerarForma(pontosTEq);

        // Instanciando pontos do triangulo (isóceles)
        Ponto2D p0TI = new Ponto2D(3, 5);
        Ponto2D p1TI = new Ponto2D(7, 5);
        Ponto2D p2TI = new Ponto2D(5, 8);

        Ponto2D[] pontosTI = {p0TI, p1TI, p2TI};

        Forma trianguloIso = Forma.gerarForma(pontosTI);

        // Instanciando pontos do triangulo (escaleno)
        Ponto2D p0TEsc = new Ponto2D(2, 2);
        Ponto2D p1TEsc = new Ponto2D(6, 2);
        Ponto2D p2TEsc = new Ponto2D(5, 5);

        Ponto2D[] pontosTEsc = {p0TEsc, p1TEsc, p2TEsc};
        
        Forma trianguloEsc = Forma.gerarForma(pontosTEsc);

        // Instanciando pontos do circulo
        Ponto2D p0C = new Ponto2D(3, 5);
        Ponto2D p1C = new Ponto2D(5, 5);

        Ponto2D[] pontosC = {p0C, p1C};

        Forma circulo = Forma.gerarForma(pontosC);

        // Instanciando um espaço 2D e adicionando as formas
        Espaco2D espaco2d = new Espaco2D();
        espaco2d.adicionarForma(quadrado);
        espaco2d.adicionarForma(trianguloEq);
        espaco2d.adicionarForma(trianguloIso);
        espaco2d.adicionarForma(trianguloEsc);
        espaco2d.adicionarForma(circulo);

        // Calculando a área e o perimetro do quadrado
        System.out.println("Área do quadrado: " + String.format("%.2f", quadrado.calcularArea()));
        System.out.println("Perimetro do quadrado: " + String.format("%.2f", quadrado.calcularPerimetro()));
        
        System.out.println();

        // Mostrando os tipos de triangulos
        System.out.println("Tipos de triangulos: \n" + espaco2d.mostrarTiposTriangulos());

        // Calculando a área e o perimetro dos triangulos
        System.out.println("Área do triangulo equilatero: " + String.format("%.2f", trianguloEq.calcularArea()));
        System.out.println("Perimetro do triangulo equilatero: " + String.format("%.2f", trianguloEq.calcularPerimetro()));
        System.out.println();
        System.out.println("Area do triangulo isoceles: " + String.format("%.2f", trianguloIso.calcularArea()));
        System.out.println("Perimetro do triangulo isoceles: " + String.format("%.2f", trianguloIso.calcularPerimetro()));
        System.out.println();
        System.out.println("Area do triangulo escaleno: " + String.format("%.2f", trianguloEsc.calcularArea()));
        System.out.println("Perimetro do triangulo escaleno: " + String.format("%.2f", trianguloEsc.calcularPerimetro()));

        System.out.println();

        // Calculando a área e o perimetro do circulo
        System.out.println("Area do circulo: " + String.format("%.2f", circulo.calcularArea()));
        System.out.println("Perimetro do circulo: " + String.format("%.2f", circulo.calcularPerimetro()));

        System.out.println();

        // Calculando a área total e o perimetro total
        System.out.println("Area total: " + String.format("%.2f", espaco2d.calcularAreaTotal()));
        System.out.println("Perimetro total: " + String.format("%.2f", espaco2d.calcularPerimetroTotal()));
    }
}
