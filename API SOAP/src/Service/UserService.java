package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import metier.User;

@WebService (name="UserWS")
public class UserService {

	@WebMethod (operationName="getUsers")
	public List<User> getUsers(){
		List<User> liste= new ArrayList<>();
		String query = "select id, email, password, roles from user";
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:7979/mglsi_news", "root", "root");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {
                liste.add(new User(rs.getInt(1),rs.getString("email"), rs.getString("password"), rs.getString("roles")));
            }
            connect.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
		return liste;
	}
	
	@WebMethod(operationName="ajouterUser")
	public Boolean ajouterUser(@WebParam(name="email") String email,@WebParam(name="password") String password, @WebParam(name="roles") String roles) {
		String query="Insert into user (email, password, roles) values (?,?,?)";
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:7979/mglsi_news", "root", "root");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, email);
            preparedStmt.setString(2, password);
            preparedStmt.setString(3, roles);
            preparedStmt.executeUpdate();
            System.out.println("Votre compte a bien été créé !");
            connect.close();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	@WebMethod(operationName="modifierUser")
	public Boolean modifierUser(@WebParam(name="id") int id,@WebParam(name="email") String email,@WebParam(name="password") String password, @WebParam(name="roles") String roles) {
		String query = "update user set email = ?, password = ?, roles = ? where id =?";
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:7979/mglsi_news", "root", "root");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, email);
            preparedStmt.setString(2, password);
            preparedStmt.setString(3, roles);
            preparedStmt.setInt(4, id);            
            preparedStmt.executeUpdate();
            System.out.println("Modification effectuée !");
			connect.close();
			return true;	
        } 
		catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	@WebMethod(operationName="supprimerUser")
	public Boolean supprimerUser(@WebParam(name="id") int id) {
		String query = "delete from user where id =?;";
	
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:7979/mglsi_news", "root", "root");
            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.executeUpdate();
			System.out.println("Suppression effectuée !");
			connect.close();
			return true;
    		
        } 
		catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
	}
	
	@WebMethod(operationName="connexionUser")
	public boolean connexionUser (@WebParam(name="email") String email, @WebParam(name="password") String password) {
		String query = "select email,password from user";
		boolean boole=false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:7979/mglsi_news","root","root");
			PreparedStatement preparedStmt = connect.prepareStatement(query);
			ResultSet rs=preparedStmt.executeQuery();
			while(rs.next()) {
				if(password.equals(rs.getString("password"))==true && email.equals(rs.getString("email"))==true) {				
					boole=true;
					break;
				}
			}
			if(boole==true) {
				System.out.println("Connexion reussie");
			}
			else {
				System.out.println("login ou mot de passe incorret");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			boole=false;
		}
		return boole;
	}
}
