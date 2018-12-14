package v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServiceReservation implements Runnable {
	private final Socket client ;
	
	ServiceReservation(Socket socket){
		this.client=socket;
	}



	
	@Override
	public void run() {
		
			System.out.println("********Connection en cours");
		
		//Fin du service d'inversion
		System.out.println("*********Connexion  terminée");
		try {client.close();} catch (IOException e2) {}
		
	}
	public void lancer() {
		new Thread(this).start();	
	}

}
