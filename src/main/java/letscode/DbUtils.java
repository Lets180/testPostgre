package letscode;

import javax.servlet.ServletRequest;
import java.sql.*;
import java.util.Scanner;

public class DbUtils {
    public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
    /*public static int maxId () throws SQLException {
        Connection conn = getStoredConnection();
        String sql = "Select a.Name, a.Age, a.Weight, a.Height, a.Id, a.Balance from Client a ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        int maxId=0;
        while (rs.next()) {
            maxId++;
        }
        return maxId;
    }*/
    public static Connection connectDb(String user, String password){
        Connection conn=null;
        String dbName=null;
        try{
           // boolean isBaseExist = false;
           // Scanner sc = new Scanner(System.in);
          //  while (!isBaseExist) {
            //    System.out.println("Enter a password to access");
              //  System.out.println("Enter a name of database to connect");
                dbName = "trainingbase"; //input name of database

                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbName, user, password);
                /*if (conn != null) {
                    System.out.println("Connection established");
                   // logger.info("Connection established");
                    isBaseExist=true;
                } else {
                    System.out.println("Connection failed");
                    //Main.logger.error("Connection failed, name of base or password is not correct");
                }*/
            //}
        } catch (Exception ex){
            System.out.println(ex);
            //logger.error("Database "+dbName+" is not exist");
        }
        return conn;
    }
    public static void storeConnection(ServletRequest request, Connection conn) {
        request.setAttribute(ATT_NAME_CONNECTION, conn);
    }
    public static Connection getStoredConnection(ServletRequest request) {
        Connection conn = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
        return conn;
    }
}
