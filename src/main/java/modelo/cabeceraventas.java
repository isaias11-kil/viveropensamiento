
package modelo;


public class cabeceraventas {
    //atributos
    private int idcabeceraventa;
    private int idclientes;
    private double valorpagar;
    private String fechaventa;
    private int estado;
    
    public cabeceraventas (){
        this.idcabeceraventa = 0;
        this.idclientes = 0;
        this.valorpagar = 0.0;
        this.fechaventa = "";
        this.estado = 0;
    }

    public cabeceraventas(int idcabeceraventa, int idclientes, double valorpagar, String fechaventa, int estado) {
        this.idcabeceraventa = idcabeceraventa;
        this.idclientes = idclientes;
        this.valorpagar = valorpagar;
        this.fechaventa = fechaventa;
        this.estado = estado;
    }

    public int getIdcabeceraventa() {
        return idcabeceraventa;
    }

    public void setIdcabeceraventa(int idcabeceraventa) {
        this.idcabeceraventa = idcabeceraventa;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public double getValorpagar() {
        return valorpagar;
    }

    public void setValorpagar(double valorpagar) {
        this.valorpagar = valorpagar;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "cabeceraventas{" + "idcabeceraventa=" + idcabeceraventa + ", idclientes=" + idclientes + ", valorpagar=" + valorpagar + ", fechaventa=" + fechaventa + ", estado=" + estado + '}';
    }
    
    
}
