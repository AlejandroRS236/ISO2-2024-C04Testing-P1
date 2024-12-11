package ISO2C04.C04_P1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Persona {

    // Atributos privados
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String titulacion;
    private String certificacionIngles;
    private int telefono;
    private String email;

    // Constructor
    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String nacionalidad,
                   String titulacion, String certificacionIngles, int telefono, String email) {
       
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.titulacion = titulacion;
        this.certificacionIngles = certificacionIngles;
        this.telefono = telefono;
        this.email = email;
    }

    // Método para determinar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }

    // Método para determinar si la persona es europea
    public boolean esEuropea() {
        String[] paisesEuropeos = {"ESP", "FRA", "DEU", "ITA", "POR", "NLD", "BEL", "LUX", "CHE", "AUT"};
        for (String codigo : paisesEuropeos) {
            if (codigo.equalsIgnoreCase(nacionalidad)) {
                return true;
            }
        }
        return false;
    }

    // Método para determinar si la persona puede matricularse en un programa de doctorado
    public boolean puedeMatricularseEnDoctorado() {
        return titulacion.equalsIgnoreCase("Master") || titulacion.equalsIgnoreCase("Doctorado");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getCertificacionIngles() {
        return certificacionIngles;
    }

    public void setCertificacionIngles(String certificacionIngles) {
        this.certificacionIngles = certificacionIngles;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", titulacion='" + titulacion + '\'' +
                ", certificacionIngles='" + certificacionIngles + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }

}
