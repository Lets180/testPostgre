package letscode;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DbFunctions {
    public static void insertRow(Connection conn, String data, String nameTable){
        Statement statement;
        String query=null;
        try{
            String[] field = data.split(",");
            query = String.format("insert into %s (name,age,weight,height,balance) values ('%s','%s','%s','%s','%s');",nameTable, field[0],field[1],field[2],field[3],field[4]);
            System.out.println("Your query: "+query);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted");
 //           logger.info("Added a new record in "+nameTable);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
   //         logger.error("Uncorrect query: "+query);
        }
    }
    public static ArrayList<String[]> readData(Connection conn, String nameTable){
        Statement statement;
        ResultSet rs=null;
        ArrayList<String[]> clientList = new ArrayList<>();
        try{
            String query = String.format("select * from %s",nameTable);
            statement = conn.createStatement();
            rs=statement.executeQuery(query);
            int i =0;
            String[] client = new String[6];
            while(rs.next()){
                client[0]=rs.getString("name");
                client[1]=rs.getString("age");
                client[2]=rs.getString("weight");
                client[3]=rs.getString("height");
                client[4]=rs.getString("id");
                client[5]=rs.getString("balance");
                clientList.add(client);
     //           logger.info("Read all data in "+nameTable);
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
    //        logger.error("Table not exist");
        }
        return clientList;
    }
    public static ArrayList<letscode.Client> readDataObject(Connection conn, String nameTable){
        Statement statement;
        ResultSet rs=null;
        ArrayList<Client> clientList = new ArrayList<>();
        try{
            String query = String.format("select * from %s",nameTable);
            statement = conn.createStatement();
            rs=statement.executeQuery(query);
            int i =0;
            Client client = new Client();
            while(rs.next()){
                client.setName(rs.getString("name"));
                client.setAge(Integer.parseInt(rs.getString("age")));
                client.setWeight(Integer.parseInt(rs.getString("weight")));
                client.setHeight(Integer.parseInt(rs.getString("height")));
                client.setIdAccount(Integer.parseInt(rs.getString("id")));
                client.setBalanceAccount(Integer.parseInt(rs.getString("balance")));
                clientList.add(client);
                //           logger.info("Read all data in "+nameTable);
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
            //        logger.error("Table not exist");
        }
        return clientList;
    }
    public void updateData(Connection conn, String nameTable,String field,int id){
        Statement statement;
        String query=null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new data");
            String newData = sc.nextLine();
            query=String.format("update %s set %s='%s' where id=%d;",nameTable,field,newData,id);
            System.out.println("Your query: "+query);
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");
      //      logger.info("Record id = "+id+" is updated");
        } catch(Exception ex){
            System.out.println(ex.getMessage());
      //      logger.error("Table not exist or uncorrect query"+query);
        }
    }
    public void searchData(Connection conn, String nameTable, String searchfield, String keyword){
        Statement statement;
        ResultSet rs=null;
        String query=null;
        try{
            query = String.format("select * from %s where %s='%s'",nameTable,searchfield,keyword);
            statement = conn.createStatement();
            rs=statement.executeQuery(query);
            while(rs.next()) {
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getString("age") + " ");
                System.out.print(rs.getString("weight") + " ");
                System.out.print(rs.getString("height") + " ");
                System.out.print(rs.getString("id") + " ");
                System.out.println(rs.getString("balance") + " ");
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
       //     logger.error("Table not exist or uncorrect query"+query);
        }
    }
    public void deleteData(Connection conn, String nameTable, String id){
        Statement statement;
        String query=null;
        try{
            query = String.format("delete from %s where id='%s'",nameTable,id);
            statement = conn.createStatement();
            statement.executeUpdate(query);
         //   logger.info("Record id = "+id+" is deleted");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
         //   logger.error("Table not exist or uncorrect query"+query);
        }
    }
}
