public class pedido {
    int bn, color, anillado;
    double total;
    boolean hecho = false;

    public void crear(int b, int c, int a){
        bn = b;
        color = c;
        anillado = a;
        hecho = true;
    }

    public void calcular(){
        total = bn*1000 + color*1500 + anillado*2000;
    }
}
