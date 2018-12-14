package v1;

public class Livre implements Document {
	int numero;
	boolean emprunte;
	@Override
	public int numero() {
		
		return this.numero;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Aller sur le serveur pour reserver un livre SI il est dispo, sinon leve une exception
		
	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Aller sur le serveur pour emprunter un livre SI il est dispo, sinon leve une exception
		
	}

	@Override
	public void retour() {
		emprunte=false;
		
	}

}
