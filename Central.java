package mayorista;

public class Central {
	final int MAXSucursales = 10;
	int[][] matriz;
	public Sucursal[] sucursales = new Sucursal[MAXSucursales];
	public Central(){
		this.matriz= new int[3][5];
			for(int i=0; i<3;i++) {
				for(int j=0; j<5;j++) {
					this.matriz[i][j] =  0;
				}
			}
		for(int n = 0;n<MAXSucursales;n++) {
			sucursales[n] = new Sucursal();
		}
	}
	public void setMaxProducto(int producto, int num){
		matriz[2][producto] = num;
	}
	public void setMinProducto(int producto, int num){
		matriz[1][producto] = num;
	}
	public void setCantProducto(int producto, int num){
		matriz[0][producto] = num;
	}
	public int getMaxProducto(int producto){
		return matriz[2][producto];
	}
	public int getMinProducto(int producto){
		return matriz[1][producto];
	}
	public int getCantidadProducto(int producto){
		return matriz[0][producto];
	}
	public void venderProducto(int producto, int vender, int idsucursal){
		if(vender<0) {
			int cant_sucursal, resto;
			cant_sucursal = sucursales[idsucursal].getCantidadProducto(producto);
			if(vender <= cant_sucursal) {
				resto = cant_sucursal - vender;
				sucursales[idsucursal].setCantProducto(producto ,resto);
			}	
			else {
				resto = vender - cant_sucursal;
				sucursales[idsucursal].setCantProducto(producto, 0);
			}
		}
	}
	public void abasteserCentral(int producto) {
		
	}
}
