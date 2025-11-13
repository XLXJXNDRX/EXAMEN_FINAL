package carpeta_de_las_clases;

public class factura {
    public void mostrar(Cliente c, Pedido p) {
        if (!p.hecho) {
            System.out.println("Primero calcula el pedido.");
            return;
        }
        System.out.println("\n--- PUNTO & COMA ---");
        System.out.println("Cliente: " + c.nombre);
        System.out.println("Tel: " + c.telefono);
        System.out.println("B/N: " + p.bn + "  Color: " + p.color + "  Anillado: " + p.anillado);
        System.out.println("Total a pagar: $" + p.total);
        System.out.println("--------------------");
    }
}
