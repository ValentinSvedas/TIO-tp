package mayorista;


public class Sucursal {

	private int[][] matriz;
	public Sucursal(){
		this.matriz= new int[3][5];
		for(int i=0; i<3;i++) {
			for(int j=0; j<5;j++) {
				this.matriz[i][j] = -1;
			}
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
	
}