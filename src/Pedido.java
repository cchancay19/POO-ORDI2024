import java.util.Date;

public class Pedido {

  //atributos de la clase
    private int idPedido;
    private Date fecha;
    private double total;
    private String estado;

    //constructor
    public Pedido (int idPedidoC, Date fechaC, double totalC, String estadoC ){
        this.idPedido = idPedidoC;
        this.fecha = fechaC;
        this.total = totalC;
        this.estado = estadoC;
    }


    //métodos

    public void solicitar(){
        this.estado = "Solicitando";
        System.out.println("El pedido ha sido solicitado");
    }

    public void cancelarPedido(){
        if (!this.estado.equals("Cancelado")){
            this.estado = "Cancelado";
            System.out.println("cancelado con éxito");
        }else{
            System.out.println("El pedido ya fue cancelado");
        }

    }

    public double calcularTotal(){
        System.out.println("Calculando pedido");
        return this.total;

    }

    public void reiniciarEstado(){
        this.estado = "Sin estado...";
        System.out.println("El pedido no tiene estado");
    }


    //Métodos GETTER and SETTER
    public int getIdPedido() {
        return idPedido;
    }

    //  @Override
    @Override
    public String toString() {
        return "Pedido{ " +
                "idPedido=" + idPedido+
                ", fecha=" +fecha+
                ", total=" +total+
                ", estado='"+estado+ '\''+
                '}';
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
