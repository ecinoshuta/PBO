package crud;

import javax.swing.*;

public class loginView {public class LoginView extends JFrame {
    JLabel tjudul, tusername, tpassword;
    JTextField iusername, ipassword;
    JButton login;
    public loginView(){
        setTitle("masuk");
        //label
        tjudul = new JLabel("login");
        tusername = new JLabel("username");
        tpassword = new JLabel("password");
        //textfield
        iusername = new JTextField("");
        ipassword = new JTextField("");
        //button
        login = new JButton("login");

        setLayout(null);
        add(tjudul);
        add(tusername);
        add(tpassword);
        add(iusername);
        add(ipassword);
        add(login);

        tjudul.setBounds(150, 50, 125, 20);
        tusername.setBounds(50, 103, 75, 20);
        tpassword.setBounds(50, 153, 75, 20);
        iusername.setBounds(150, 100, 175, 30);
        ipassword.setBounds(150, 150, 175, 30);
        login.setBounds(150, 200, 75, 30);

        setSize(400,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUsername(){
        return iusername.getText();
    }

    public String getPassword(){
        return ipassword.getText();
    }
    }


}
