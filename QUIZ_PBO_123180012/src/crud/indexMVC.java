package crud;

public class indexMVC {
    indexView indexview = new indexView();
    indexModel indexmodel = new indexModel();
    indexDAO indexdao = new indexDAO();
    indexController indexcontroller = new indexController(indexview, indexmodel, indexdao);
}
