package futbol;

public class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private String posicion;
	public Futbolista(String n,int e,String p) {
		this.nombre=n;
		this.edad=e;
		this.posicion=p;
	}
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	@Override
	public int compareTo(Object o) {
		return 0;
	}
	public String toString() {
		return "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion;
	}
	public boolean equals(Futbolista i) {
		return super.equals(i);
	}
	public boolean jugarConLasManos() {
		return false;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setEdad(int i) {
		this.edad=i;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setPosicion(String p) {
		this.posicion=p;
	}
	public String getPosicion() {
		return this.posicion;
	}
	
}
