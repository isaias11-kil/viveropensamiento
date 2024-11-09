
package modelo;


public class detalleventa {
    //atributos
    private int iddetalleventa;
    private int idcabeceraventa;
    private String idproducto;
    private String nombre;
    private int cantidad;
    private double preciounitario;
    private double subtotal;
    private double totalpagar;
    private int estado;
    
    public detalleventa (){
        this.iddetalleventa =0;
        this.idcabeceraventa =0;
        this.idproducto="";
        this.nombre ="";
        this.cantidad =0;
        this.preciounitario =0.0;
        this.subtotal =0.0;
        this.totalpagar =0.0;
        this.estado =0;
    }

    public detalleventa(int iddetalleventa, int idcabeceraventa, String idproducto, String nombre, int cantidad, double preciounitario, double subtotal, double totalpagar, int estado) {
        this.iddetalleventa = iddetalleventa;
        this.idcabeceraventa = idcabeceraventa;
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.subtotal = subtotal;
        this.totalpagar = totalpagar;
        this.estado = estado;
    }

    public int getIddetalleventa() {
        return iddetalleventa;
    }

    public void setIddetalleventa(int iddetalleventa) {
        this.iddetalleventa = iddetalleventa;
    }

    public int getIdcabeceraventa() {
        return idcabeceraventa;
    }

    public void setIdcabeceraventa(int idcabeceraventa) {
        this.idcabeceraventa = idcabeceraventa;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotalpagar() {
        return totalpagar;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "detalleventa{" + "iddetalleventa=" + iddetalleventa + ", idcabeceraventa=" + idcabeceraventa + ", idproducto=" + idproducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", preciounitario=" + preciounitario + ", subtotal=" + subtotal + ", totalpagar=" + totalpagar + ", estado=" + estado + '}';
    }
    
    
    
}
