

package hm;

import java.sql.Connection;
import java.sql.DriverManager;


public class Mysql {
    
    static private Connection connection;

    public static Connection getCon() throws Exception{
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","root");
        }
        return connection;
                   }
}
