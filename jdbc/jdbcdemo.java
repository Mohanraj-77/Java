package jdbc;

import java.sql.* ;

public class jdbcdemo {
                       
	
	public static void main(String[] args) throws Exception {
		
		read() ;
		insert() ;
		insertvar() ;
		insertprep() ;
		delete() ;
		update() ;
		
}
	static void read () throws Exception 
	{
		String url = "jdbc:mysql://localhost:3306/jdbc" ;               // Read a file
		String username = "root" ;
		String password = "root" ;
		String query = "select * from employee";
		
		Connection con = DriverManager.getConnection(url,username,password) ;
		Statement st = con.createStatement() ;
		ResultSet rs = st.executeQuery(query) ;
		
		rs.next();
		System.out.println(rs.getInt(1)) ;
		System.out.println(rs.getString(2)) ;
		System.out.println(rs.getInt(3));	
		System.out.println(rs.getFloat(4)) ;
		
		con.close() ;
		
	}
	
	static void insert () throws Exception                                 // Insert a file
	{
		String url = "jdbc:mysql://localhost:3306/jdbc" ;
		String username = "root" ;
		String password = "root" ;
		String query = "insert into employee values (2,'ravi',20000,8.9)";
		
		Connection con = DriverManager.getConnection(url,username,password) ;
		Statement st = con.createStatement() ;
		int rows = st.executeUpdate(query) ;
		
		System.out.println("Number of rows affected : " + rows) ;
		
		
		
		
		
		con.close() ;
		
	}
	
	static void insertvar () throws Exception                                 // Insert a file using variable
	{
		String url = "jdbc:mysql://localhost:3306/jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		int id = 3;
		String name = "Tamil";
		int salary = 40000;
		float cpm = 7.7f ;
		
		String query = "insert into employee values (" + id + ",'" + name + "'," + salary + ",' " + cpm + "');";
		
		Connection con = DriverManager.getConnection(url,username,password) ;
		Statement st = con.createStatement() ;
		int rows = st.executeUpdate(query) ;
		
		System.out.println("Number of rows affected : " + rows) ;
		
		
		
		
		
		con.close() ;
		
	}
	
	static void insertprep() throws Exception                                 // Insert a file using preparation method
	{
		String url = "jdbc:mysql://localhost:3306/jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		int id = 4;
		String name = "max";
		int salary = 45000;
		float cpm = 8.8f ;
		
		String query = "insert into employee values (?,?,?,?)" ;
		
		Connection con = DriverManager.getConnection(url,username,password) ;
		
		PreparedStatement p = con.prepareStatement(query);
		p.setInt(1,id);
		p.setString(2, name);
		p.setInt(3, salary);
		p.setFloat(4, cpm);
		
		int rows = p.executeUpdate();
		
		System.out.println("Number of rows affected : " + rows) ;
		
		
		
		
		
		con.close() ;
		
	}
	
	static void delete () throws Exception                                 // Delete a file using variable
	{
		String url = "jdbc:mysql://localhost:3306/jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		int id = 3;
		
		String query = "delete from employee where id = " + id ;
		
		Connection con = DriverManager.getConnection(url,username,password) ;
		Statement st = con.createStatement() ;
		int rows = st.executeUpdate(query) ;
		
		System.out.println("Number of rows affected : " + rows) ;
		
		
		
		
		
		con.close() ;
		
	}
	
	static void update () throws Exception                                 // update a file using variable
	{
		String url = "jdbc:mysql://localhost:3306/jdbc" ;
		String username = "root" ;
		String password = "root" ;
		
		
		String query = " update employee set salary = 100000 where id = 1 ";
		
		Connection con = DriverManager.getConnection(url,username,password) ;
		Statement st = con.createStatement() ;
		int rows = st.executeUpdate(query) ;
		
		System.out.println("Number of rows affected : " + rows) ;
		
		
		
		
		
		con.close() ;
		
	}
	

}
