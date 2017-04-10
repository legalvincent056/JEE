package dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DaoConnection {

	
	private static final String pilote = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bddclients";
	private static final String USER = "root";
	private static final String PWD = "";
	private static Connection con = null;
	
	//Connection
	
	public static Connection getConnection(){
		if(con == null){
			try {
				//1- Charger le pilote
				Class.forName(pilote);
						
				//2- Créer la connexion
				Connection con = (Connection) DriverManager.getConnection(URL,USER,PWD);
			} catch(Exception e){
				e.printStackTrace();
			}
			return con;
		}
		else{
			return con;
		}
	}
	
	//deconnection
	
	public static void closeConnection(){
		if(con != null){
			try{
				con.close();
				con = null;
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	
}
