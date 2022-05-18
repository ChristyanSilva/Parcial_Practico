package modelo;


public class Cuenta {
    private String noCuenta;
    private String tipo;
    private double saldoInicial;
    public Usuario usuario;

    public Cuenta() {
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    
    public Cuenta(String noCuenta, String tipo, double saldoInicial, Usuario usuario) {
        this.noCuenta = noCuenta;
        this.tipo = tipo;
        this.saldoInicial = saldoInicial;
    }
    
    
    
}
