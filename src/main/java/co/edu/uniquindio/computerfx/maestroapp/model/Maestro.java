package co.edu.uniquindio.computerfx.maestroapp.model;

import co.edu.uniquindio.computerfx.maestroapp.model.builder.MaestroBuilder;

public class Maestro {
    private String nombre;
    private String cedula;
    private int edad;
    private String email;
    private String celular;
    private String materiaAsignada;

    public Maestro() {
    }

    public Maestro(String nombre, String cedula, int edad, String email,
                   String celular, String materiaAsignada) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.email = email;
        this.celular = celular;
        this.materiaAsignada = materiaAsignada;
    }

    public static MaestroBuilder builder(){
        return new MaestroBuilder();
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

    public String getMateriaAsignada() {
        return materiaAsignada;
    }

    public void setMateriaAsignada(String materiaAsignada) {
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
                ", MateriaAsignada=" + materiaAsignada + '\'' +
                '}';
    }
    public String imprimirMaestro() {
        return "Maestro{" +
                "materiaAsignada='" + materiaAsignada + '\'' +
                '}';
    }
}