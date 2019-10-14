package mayorista;

public class SimularRedMayorista {
	public static void main(String[] args) {
		int prueba, prueba2;
		Central central = new Central();
		//central.setMaxProducto(4,60);
		//central.sucursales[1].setMaxProducto(4,20);
		prueba = central.getCantidadProducto(2);
		imprimir_prueba(prueba);
		prueba2 = central.sucursales[1].getCantidadProducto(2);
		imprimir_prueba(prueba2);
	}

	private static void imprimir_prueba(int prueba) {
		System.out.println("el producto 2 tiene " +prueba+" productos");
		
	}

	public void abasteserCentral(int producto) {
		int cant, max, min;
		central.getMaxProducto(producto);
	}
}
		
				

