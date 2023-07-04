import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        System.out.println("Bienvenido al sistema de Cálculos de Área y Perímetro");

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("a) Triángulo");
            System.out.println("b) Cuadrado");
            System.out.println("c) Círculo");
            System.out.println("d) Piramide");
            System.out.println("e) Cubo");
            System.out.println("f) Esfera");
            System.out.println("q) Salir");

            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case 'a':
                    Triangulo tr = new Triangulo();
                    tr.IngresarPuntos();
                    System.out.println("Area:"+tr.CalcularArea());
                    System.out.println("Perimetro:"+tr.CalcularPerimetro());
                    break;
                case 'b':
                    Cuadrado cu = new Cuadrado();
                    cu.IngresarPuntos();
                    System.out.println("Area:"+cu.CalcularArea());
                    System.out.println("Perimetro:"+cu.CalcularPerimetro());
                    break;
                case 'c':
                    Circulo ci = new Circulo();
                    ci.IngresarPuntos();
                    System.out.println("Area:"+ci.CalcularArea());
                    System.out.println("Perimetro:"+ci.CalcularPerimetro());
                    break;
                case 'd':
                    Piramide pi  = new Piramide();
                    pi.IngresarPuntos();
                    System.out.println("Area:"+pi.CalcularArea());
                    System.out.println("Perimetro:"+pi.CalcularPerimetro());
                    System.out.println("Volumen:"+pi.CalcularVolumen());
                    break;
                case 'e':
                    Cubo cb = new Cubo();
                    cb.IngresarPuntos();
                    System.out.println("Area:"+cb.CalcularArea());
                    System.out.println("Perimetro:"+cb.CalcularPerimetro());
                    System.out.println("Volumen:"+cb.CalcularVolumen());
                    break;
                case 'f':
                    Esfera es = new Esfera();
                    es.IngresarPuntos();
                    System.out.println("Area:"+es.CalcularArea());
                    System.out.println("Perimetro:"+es.CalcularPerimetro());
                    System.out.println("Volumen:"+es.CalcularVolumen());
                    break;
                case 'q':
                    System.out.println("Saliendo del programa...");
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 'q');
    }
}