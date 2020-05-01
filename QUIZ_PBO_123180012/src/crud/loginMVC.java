package crud;

public class loginMVC {
    loginView loginview = new loginView();
    loginModel loginmodel = new loginModel();
    loginDAO logindao = new loginDAO();
    loginController logincontroller = new loginController(loginview, loginmodel, logindao);
}

