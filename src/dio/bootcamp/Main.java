package dio.bootcamp;

public class Main {

    public static void main(String[] args) {

        //Utilizado para mostrar os resultados em sobrecarga
     /*   //Quadrilatero
        System.out.println("Exercício quadrilatero:");
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,9);*/

        //Utilizado para os resultados em return

        System.out.println("Exercício Retornos: ");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapezio: " + areaTrapezio);

    }
}
