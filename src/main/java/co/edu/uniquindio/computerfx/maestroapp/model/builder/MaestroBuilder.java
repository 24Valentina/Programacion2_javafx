package co.edu.uniquindio.computerfx.maestroapp.model.builder;

import co.edu.uniquindio.computerfx.maestroapp.model.Maestro;

public class MaestroBuilder {
    protected String nombre;
    protected String cedula;
    protected int edad;
    protected String email;
    protected String celular;
    protected String materiaAsignada;

    public MaestroBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public MaestroBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public MaestroBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public MaestroBuilder email(String email) {
        this.email = email;
        return this;
    }

    public MaestroBuilder celular(String celular) {
        this.celular = celular;
        return this;
    }

    public MaestroBuilder materiaAsignada(String materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
        return this;
    }


    public Maestro build() {
        return new Maestro( nombre, cedula, edad, email, celular, materiaAsignada);
    }
}
