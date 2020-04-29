package Mahasiswa;

public class mhsMVC {
    mhsView mhsview = new mhsView();
    mhsModel mhsmodel = new mhsModel();
    mhsDAO mhsDAO = new mhsDAO();
    mhsController mhsController = new mhsController(mhsmodel, mhsview, mhsDAO);
}
