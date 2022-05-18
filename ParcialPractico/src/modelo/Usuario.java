package modelo;


public class Usuario {
    private String CC;
    private String nombre ;
    private String apellido;
    private char sexo;

    public Usuario() {
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Usuario(String CC, String nombre, String apellido, char sexo) {
        this.CC = CC;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }
    
    
    
    
}
