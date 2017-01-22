package br.com.buscape;

import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

		Connection c = null;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:cena.db");


	        //create table 
	        Statement st = c.createStatement();
	        st.executeUpdate("CREATE table village (id int, name varchar(20))");
	        //insert row
	        st.executeUpdate("INSERT INTO village VALUES (111, 'Concretepage')");
	        //select
	        String query = "SELECT id, name from village";
	        ResultSet rs = null;
            try {
               rs = st.executeQuery(query);
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					System.out.println("id:"+ id+ ", name: "+ name);
				}
            } finally {
        	    rs.close();
            }
            //delete
            st.executeUpdate("DELETE from village");

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Opened database successfully");
    }
}
