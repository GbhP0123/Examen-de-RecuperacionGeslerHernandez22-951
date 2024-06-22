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
