package futbol;

public class Jugador extends Futbolista implements Comparable<Object> {
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
		this.dorsal=7;
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
	public static void main(String[] args) {
		Jugador f = new Jugador();
		boolean ok = false;
		if (f.getEdad() == 30 && f.getNombre().equals("Maradona") 
				&& f.getPosicion().equals("delantero") && f.golesMarcados == 289
				&& f.dorsal == 7) {
			ok = true;
		}
		System.out.print(ok);
	}
}
