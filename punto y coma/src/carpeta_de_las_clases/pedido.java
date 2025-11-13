package carpeta_de_las_clases;

public class pedido {
    int bn, color, anillado;
    double total;
    boolean hecho = false;

    public void crear(int bn, int color, int anillado) {
        this.bn = bn;
        this.color = color;
        this.anillado = anillado;
        hecho = true;
    }

    public void calcular() {
        if (!hecho) {
            System.out.println("Primero haz el pedido.");
            return;
        }
        double pbn = (bn >= 100) ? 150 : 200;
        double pcolor = (color >= 50) ? 400 : 500;
        double panillado = 3000;
        total = (bn * pbn) + (color * pcolor) + (anillado * panillado);
        if (bn + color + anillado >= 30) total -= total * 0.1;
        else if (total > 40000) total -= total * 0.05;
    }
}
