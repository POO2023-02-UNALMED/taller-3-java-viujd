package taller3.televisores;

public class Control {
	private TV tv;
	
	//public Control (TV tv) {
		//this.tv=tv;
	//}
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		if(tv.getVolumen()>=0 && tv.getVolumen()<7 && tv.getEstado()==true) {
			tv.volumenUp();;
		}
	}
	
	public void volumenDown() {
		if(tv.getVolumen()>0 && tv.getVolumen()<=7 && tv.getEstado()==true) {
			tv.volumenDown();;
		}
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV tv) {
		this.tv=tv;
	}
	

}
