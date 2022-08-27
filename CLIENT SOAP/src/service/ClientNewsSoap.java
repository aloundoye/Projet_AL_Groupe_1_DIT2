package service;

import java.util.List;
import java.util.Scanner;

public class ClientNewsSoap {

	public static void main(String[] args) {
		
		UserWS stub = new UserServiceService().getUserWSPort();
		Scanner sc = new Scanner(System.in);
		
		int choix=0;
		
		System.out.println("Bienvenue sur l'appli de gestion des Utilisateurs");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("");
		System.out.println("1. Ajouter un utilisateur");
		System.out.println("2. Afficher la liste des utilisateur");
		System.out.println("3. Modifer les informations d'un utilisateur");
		System.out.println("4. Supprimer un utilisateur");
		System.out.println("");
		System.out.println("Vous devez d'abord vous authentifier");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("");
		

		String email;
		String password;
		boolean e=false;
		
		do{
			System.out.println("Entrez votre email");
			email=sc.nextLine();
			System.out.println("Entrez votre password");
			password=sc.nextLine();
			e=stub.connexionUser(email, password);
		}while(e==false);
		
		System.out.println("Quel est votre choix");
		choix=sc.nextInt();
		
		switch(choix) {
			
			case 1: 
				Scanner sc1= new Scanner(System.in);
				System.out.println("Entrez son email");
				String email1 = sc1.nextLine();
				System.out.println("Entrez son mdp");
				String password1 = sc1.nextLine();
				System.out.println("Entrez son role");
				String roles = sc1.nextLine();
				boolean e1 = stub.ajouterUser(email1, password1, roles);
				break;
				
			case 2:
				List <User> et1= stub.getUsers();
				for(User et : et1) {
					System.out.println(et.getId()+" "+ et.getEmail() + " " + et.getMdp());
				}
				break;
				
			case 3:
				Scanner sc2= new Scanner(System.in);
				System.out.println("Entrez son id");
				int id1 =sc.nextInt();
				System.out.println("Entrez son email");
				String email2 = sc2.nextLine();
				System.out.println("Entrez son mdp");
				String password2 = sc2.nextLine();
				System.out.println("Entrez son roles");
				String roles1 = sc2.nextLine();
				boolean e2= stub.modifierUser(id1, email2, password2, roles1);
				break;
				
			case 4:
				System.out.println("Entrez son id");
				int id3 =sc.nextInt();
				boolean e3= stub.supprimerUser(id3);
				break;
				
			default:
				System.out.println("Bonne journee");
		}
		sc.close();
	}	
}
