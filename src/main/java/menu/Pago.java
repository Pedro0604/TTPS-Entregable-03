package menu;

public class Pago {
    private Pedido pedido;
    private MetodoPago metodo;

    public Pago(Pedido pedido, MetodoPago metodo) {
        this.pedido = pedido;
        this.metodo = metodo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

}
