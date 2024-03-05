package co.edu.uniquindio.computerfx.maestroapp.model;

public class Maestro {
    private String nombre;
    private String cedula;
    private int edad;
    private String email;
    private String celular;
    private String materiaAsignada;

    public Maestro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getmateriaAsignada() {
        return materiaAsignada;
    }

    public void setmateriaAsignada(String materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    public String imprimirMaestroPrimaria() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", materiaAsignada='" + materiaAsignada + '\'' +
                '}';
    }
    public String imprimirMaestroSecundaria() {
        return "Maestro{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                "Materia asignada" + materiaAsignada;
    }
    public String imprimirMaestro() {
        return "Maestro{" +
                "materiaAsignada='" + materiaAsignada + '\'' +
                '}';
    }
}