package creationalpattern;

public class Connection {
      static Connection con;
      private Connection() {
    	  
      }
public static Connection getConnection() {
	//if(con!=null)
		//return con;
	//else
		//con=new Connection();
	//return con;
	return new Connection();
}
}