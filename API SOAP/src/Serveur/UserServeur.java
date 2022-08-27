package Serveur;

import javax.xml.ws.Endpoint;
import Service.UserService;

public class UserServeur {

	public static void main(String[] args) {	
		String url ="http://localhost:8585/";
		Endpoint.publish(url, new UserService());
		System.out.println(url);
	}
}
