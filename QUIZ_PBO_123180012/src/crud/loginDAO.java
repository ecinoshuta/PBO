package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginDAO {
    private Connection koneksi;
    private Statement statement;
    public loginDAO(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/film";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class Not Found : " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }

    public void login(loginModel md){
        try{
            String query = "SELECT * FROM login WHERE username = '"+login.getUsername() +"' && password = '"+ login.getPassword() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            JOptionPane.showMessageDialog(null, "Selamat Datang");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}


