/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author Sistemas
 */
public class Alumno {
    
    private int Cedula;
    private String Nombre;
    private String Apellido;
    private int Semestre;
    private String Correo;
    private int Celular;

    public Alumno() {
    }

    public Alumno(int Cedula, String Nombre, String Apellido, int Semestre, String Correo, int Celular) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Semestre = Semestre;
        this.Correo = Correo;
        this.Celular = Celular;
    }

    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getSemestre() {
        return Semestre;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }
    
    
}
