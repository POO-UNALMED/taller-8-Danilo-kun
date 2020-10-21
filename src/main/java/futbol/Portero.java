package futbol;

public class Portero extends Futbolista implements Comparable<Object> {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String n, int e, short g, byte d) {
		super(n,e,"Portero");
		this.golesRecibidos=g;
		this.dorsal=d;
	}
	public String toString() {
			return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
	}
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	public int compareTo(Portero o) {
			return(o.getGolesRecibidos()-this.getGolesRecibidos());
	}
	public void setGolesRecibidos(short i) {
		this.golesRecibidos=i;
	}
	public short getGolesRecibidos() {
		return this.golesRecibidos;
	}
	public void setDorsal(byte i) {
		this.dorsal=i;
	}
	public byte getDorsal() {
		return this.dorsal;
	}
	
}
