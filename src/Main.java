import java.util.Date;

public class Main {
    public static void main(String[] args) {

   Pedido pedido = new Pedido(25, new Date(), 10.5, "prueba") ;
   pedido.solicitar();
   pedido.cancelarPedido();
   pedido.cancelarPedido();



    }
}