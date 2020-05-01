package crud;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class loginController {
    loginView loginview;
    loginModel loginmodel;
    loginDAO logindao;
    public loginController(loginView loginview,loginModel loginmodel, loginDAO logindao){
        loginview.login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = loginview.getUsername();
                String password = loginview.getPassword();
                if(username.isEmpty() || password.isEmpty()){
                    JOptionPane.showMessageDialog(null, "isi semua field");
                }else{
                    loginmodel.setLoginModel(username, password);
                    logindao.Login(loginmodel);
                    indexMVC mvc = new indexMVC();
                }
            }
        });
    }
}
