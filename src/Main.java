import figurasGeometricas.Triangulo;
import util.FechaUtil;

public class Main {
    public static void main(String[] args) {
        Triangulo trianguloAzul = new Triangulo();
        trianguloAzul.establecerBase(6); // X trianguloAzul.base = 6
        System.out.println(trianguloAzul);

        Triangulo trianguloRojo = new Triangulo();
        System.out.println(trianguloRojo.obtenerBase());
        trianguloRojo.establecerBase(10);
        System.out.println(trianguloRojo);
        System.out.println(trianguloRojo.obtenerBase());

        System.out.println("Resultado: " + trianguloAzul.sumar(5, 6));

        // FechaUtil fechaUtil = new FechaUtil(); --> no es necesario crear instancia
        System.out.println("Resultado suma dos: " + FechaUtil.sumarDos(12, 9));

        System.out.println("Fecha actual: " + FechaUtil.obtenerFechaHora());

        /**
         * Crear dos clases, las que ustedes elijan, con al menos tres atributos
         * Y en la clase principal crear un objeto de cada uno.
         * (5 puntos)
         */
    }
}