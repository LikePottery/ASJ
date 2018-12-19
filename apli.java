package v1;

public class apli {
	public static void main(String[] args) {
		Abonne n1 = new Abonne (1);
		Abonne n2 = new Abonne(2);
		Serveur s= new Serveur();
		Socket suck = new Socket("127.0.0.1",2601);
		System.out.println("Serveur lance sur le port " + s.port);
		
		
	}
}
