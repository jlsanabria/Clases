package figurasGeometricas;

public class Triangulo {
    // Variables de clase
    private int base;
    private int altura;

    // primer método
    public void establecerBase(int base) {
        this.base = base;
    }

    // segundo método
    public int obtenerBase() {
        return this.base;
    }

    // tercer método
    public int sumar(int a, int b) {
        int s = a + b;
        return s;
    }

    @Override
    public String toString() {
        return "Triangulo [" +
                "base=" + base +
                ", altura=" + altura +
                ']';
    }
}
