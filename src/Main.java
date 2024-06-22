import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamenFinalVarianteA {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n====================");
            System.out.println("       Menu");
            System.out.println("====================");;
            System.out.println("1. Calculadora basica");
            System.out.println("2. Lista de estudiantes");
            System.out.println("3. Gestion de estudiantes");
            System.out.println("4. Salir");
            System.out.println("====================");
            System.out.print("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    menu.calculadoraBasica();
                    break;
                case 2:
                    menu.listaDeEstudiantes();
                    break;
                case 3:
                    menu.gestionDeEstudiantes();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("Error: Opcion no valida. Por favor, seleccione otra Opcion.");
                    break;
            }
        }

        scanner.close();
    }
}
class Estudiante {
    private String nombre;
    private double calificacion;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificacion = -1; // Indica que la calificación no ha sido asignada
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}

class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Estudiante> estudiantes = new ArrayList<>();

public void calculadoraBasica() {
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    System.out.print("Ingrese la operación (+, -, *, /): ");
    char operacion = scanner.next().charAt(0);

    double resultado = 0;
    boolean operacionValida = true;

    switch (operacion) {
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: No se puede Dividir por Cero");
                operacionValida = false;
            }
            break;
        default:
            System.out.println("Operación no válida.");
            operacionValida = false;
            break;
    }

    if (operacionValida) {
        System.out.println("El resultado es: " + resultado);
    }
}

