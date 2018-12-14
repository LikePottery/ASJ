package v1;

import java.io.*;
import java.net.*;

class ServeurReservation implements Runnable {
	private ServerSocket listen_socket;
	
	// Cree un serveur TCP - objet de la classe ServerSocket
	ServeurReservation() throws IOException {
		listen_socket = new ServerSocket(2500);
	}

	// Le serveur ecoute et accepte les connexions.
	// pour chaque connexion, il cree un ServiceInversion, 
	// qui va la traiter, et le lance
	public void run() {
		try {
			while(true)
				new ServiceReservation(listen_socket.accept()).lancer();
		}
		catch (IOException e) { 
			try {this.listen_socket.close();} catch (IOException e1) {}
			System.err.println("Pb sur le port d'écoute :"+e);
		}
	}

	 // restituer les ressources --> finalize
	protected void finalize() throws Throwable {
		this.listen_socket.close();
	}
}
