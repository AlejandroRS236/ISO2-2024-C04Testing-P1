package ISO2C04.C04_P1;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese los apellidos:");
            String apellidos = scanner.nextLine();

            LocalDate fechaNacimiento = null;
            while (fechaNacimiento == null) {
                try {
                    System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
                    fechaNacimiento = LocalDate.parse(scanner.nextLine());
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de fecha incorrecto. Por favor, inténtelo nuevamente.");
                }
            }

            System.out.println("Ingrese la nacionalidad (Código ISO(\"ESP\", \"FRA\", \"DEU\", \"ITA\", \"POR\", \"NLD\", \"BEL\", \"LUX\", \"CHE\", \"AUT\")):");
            String nacionalidad = scanner.nextLine();

            System.out.println("Ingrese la titulación:");
            String titulacion = scanner.nextLine();

            String certificacionIngles = null;
            String[] nivelesIngles = {"NULO","A1", "A2", "B1", "B2", "C1", "C2"};
            while (certificacionIngles == null) {
                System.out.println("Ingrese la certificación de inglés (NULO,A1, A2, B1, B2, C1, C2):");
                String input = scanner.nextLine().toUpperCase();
                for (String nivel : nivelesIngles) {
                    if (nivel.equals(input)) {
                        certificacionIngles = input;
                        break;
                    }
                }
                if (certificacionIngles == null) {
                    System.out.println("Nivel de inglés inválido. Por favor, ingrese uno de los niveles válidos: A1, A2, B1, B2, C1, C2. Si no tiene nivel de ingles escriba \"nulo\"");
                }
            }

            int telefono = 0;
            boolean telefonoValido = false;
            while (!telefonoValido) {
                try {
                    System.out.println("Ingrese el número de teléfono (solo dígitos):");
                    telefono = Integer.parseInt(scanner.nextLine());
                    telefonoValido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Número de teléfono inválido. Por favor, ingrese solo dígitos.");
                }
            }

            System.out.println("Ingrese el correo electrónico:");
            String email = scanner.nextLine();

            Persona persona = new Persona(nombre, apellidos, fechaNacimiento, nacionalidad, titulacion, certificacionIngles, telefono, email);

            System.out.println("\nInformación de la persona:");
            System.out.println(persona);

            System.out.println("\nEs mayor de edad: " + persona.esMayorDeEdad());
            System.out.println("Es europea: " + persona.esEuropea());
            System.out.println("Puede matricularse en un doctorado: " + persona.puedeMatricularseEnDoctorado());
        } catch (Exception e) {
            System.err.println("Se produjo un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
}
