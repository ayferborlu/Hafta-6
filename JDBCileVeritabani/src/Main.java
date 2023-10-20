import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String url ="jdbc:mysql://localhost/company";
        String user ="root";
        String password ="Ayfer";
        String query = "Select id,name,salary,position from employees";

        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            st=conn.createStatement();
           ResultSet resultSet= st.executeQuery(query);
           while(resultSet.next()){
               System.out.println("id: " + resultSet.getInt("id"));
               System.out.println("name: " + resultSet.getString("name"));
               System.out.println("salary: " + resultSet.getDouble("salary"));
               System.out.println("position: " + resultSet.getString("position"));
               System.out.println("-----******-------");
           }

        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }


    }
}