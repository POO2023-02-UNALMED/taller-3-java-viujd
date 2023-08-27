package taller3.televisores;

public class TV {
		private Marca marca;
		private int canal;
		private int precio;
		private boolean estado;
		private int volumen;
		private Control control;
		private static int numTV=0; 
		 
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
	    this.estado = estado;
	    this.canal = 1;
	    this.volumen = 1;
	    this.precio = 500;
	    numTV++;
	}

	public Marca getMarca() {
	    return marca;
	}

	public void setMarca(Marca marca) {
	    this.marca = marca;
	}

	public int getCanal() {
	    return canal;
	}

	public void setCanal(int canal) {
	    this.canal = canal;
	}

	public int getPrecio() {
	    return precio;
	}

	public void setPrecio(int precio) {
	    this.precio = precio;
	}

	public boolean getEstado() {
	    return estado;
	}

	public void setEstado(boolean estado) {
	    this.estado = estado;
	}

	public int getVolumen() {
	    return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public static int getNumTV() {
		return numTV;
	}

}
