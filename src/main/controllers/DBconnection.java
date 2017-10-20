import java.sql.*;

public class DBconnection {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            String databaseUrl="jdbc:mysql://localhost:3309/games";
            String databaseUser="root";
            String databasePass="soen387";


            Connection con=DriverManager.getConnection(databaseUrl, databaseUser,databasePass);


            //Queries here!!
            Statement stmt=con.createStatement();

            ResultSet rs= stmt.executeQuery("select game_name from game ");


            while(rs.next())

            {

                System.out.println(rs.getString(1));

            }


            con.close();

        } catch (Exception e) {
            System.out.println(e);

        }


    }
}