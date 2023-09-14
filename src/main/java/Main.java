import java.util.*;

public final class Main {

    public static Double calcularTotalProducto(int descuento, Double valorProducto) {
        Double total = 0.0;
        total = valorProducto - (valorProducto * (Double.parseDouble(String.valueOf(descuento)) * 10 / 100));

        return total;
    }


    public static void main(String[] args) {
        Map<Object, Object> clientesPrecioTotal = new HashMap<>();
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("123");
        clientes.add("222");
        clientes.add("333");
        clientes.add("444");
        clientes.add("555");
        clientes.add("777");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int descuento = r.nextInt(9) + 1;

        System.out.print("ingrese el numero de documento: ");
        String documento = sc.next();

        System.out.print("\ningrese el valor del producto: ");
        Double valorProducto = sc.nextDouble();

        if (clientes.contains(documento)) {
            valorProducto = calcularTotalProducto(descuento, valorProducto);
        }

        clientesPrecioTotal.put(documento, valorProducto);


        System.out.println(clientesPrecioTotal.toString());
    }
}
