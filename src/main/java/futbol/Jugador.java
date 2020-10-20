package futbol;

public class Jugador extends Futbolista implements Comparable<Futbolista> {
	public short golesMarcados;
	public byte dorsal;
	public Jugador(String n, int e, String p, short g,byte d) {
		super(n,e,p);
		this.golesMarcados=g;
		this.dorsal=d;
	}
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=9;
	}
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;
	}
	public int compareTo(Futbolista i) {
		return(this.getEdad()-i.getEdad());
	}
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
}
