package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		if(volumen >= 0 && volumen <= 7 && estado == true) {
			this.volumen = volumen;
		}	
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int canal) {
		if(canal >= 1 && canal <= 120 && estado == true) {
			this.canal = canal;
		}
		
	}
	
	public int getCanal() {
		return canal;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int num) {
		numTV = num;
	}
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(canal >= 1 && canal < 120 && estado == true) {
			canal++;
		}
	}
	
	public void canalDown() {
		if(canal > 1 && canal <= 120 && estado == true) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if(volumen >= 0 && volumen < 7 && estado == true) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if(volumen > 0 && volumen <= 7 && estado == true) {
			volumen--;
		}
	}
}