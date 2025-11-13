import java.util.Scanner;
package carpeta_de_las_clases;

public class menu {
    Scanner sc = new Scanner(System.in);
    Cliente c = null;
    pedido p = new pedido();
    factura f = new factura();

    public void mostrar() {
        int op = 0;
        while (op != 5) {
            System.out.println("\n1. Cliente");
            System.out.println("2. Pedido");
            System.out.println("3. Calcular");
            System.out.println("4. Factura");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            if (!sc.hasNextInt()) {
                System.out.println("Inválido.");
                sc.next();
                continue;
            }
            op = sc.nextInt();

            switch (op) {
                case 1 -> cliente();
                case 2 -> pedido();
                case 3 -> p.calcular();
                case 4 -> f.mostrar(c, p);
                case 5 -> System.out.println("Chao");
                default -> System.out.println("Inválido");
            }
        }
    }

    void cliente() {
        sc.nextLine();
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        System.out.print("Teléfono: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Inválido.");
            sc.next();
            return;
        }
        double t = sc.nextDouble();
        if (t <= 0) {
            System.out.println("Inválido.");
            return;
        }
        c = new Cliente(n, t);
    }

    void pedido() {
        if (c == null) {
            System.out.println("Primero crea el cliente.");
            return;
        }
        System.out.print("B/N: ");
        if (!sc.hasNextInt()) { sc.next(); return; }
        int bn = sc.nextInt();
        System.out.print("Color: ");
        if (!sc.hasNextInt()) { sc.next(); return; }
        int color = sc.nextInt();
        System.out.print("Anillado: ");
        if (!sc.hasNextInt()) { sc.next(); return; }
        int anillado = sc.nextInt();
        if (bn <= 0 || color <= 0 || anillado <= 0) {
            System.out.println("No se aceptan 0 o negativos.");
            return;
        }
        p.crear(bn, color, anillado);
    }
}
