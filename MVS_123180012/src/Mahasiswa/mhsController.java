package Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class mhsController {
    mhsModel mhsmodel;
    mhsView mhsview;
    mhsDAO mhsdao;

    public mhsController(mhsModel mhsmodel, mhsView mhsview, mhsDAO mhsdao){
        this.mhsmodel = mhsmodel;
        this.mhsview = mhsview;
        this.mhsdao = mhsdao;

        if (mhsdao.getJmldata() != 0){
            String dataMahasiswa[][] = mhsdao.readMahasiswa();
            mhsview.tabel.setModel((new JTable(dataMahasiswa, mhsview.namaKolom)).getModel());
        }else{
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        mhsview.simpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = mhsview.getNim();
                String nama = mhsview.getNama();
                String alamat = mhsview.getAlamat();
                if(nim.isEmpty()||nama.isEmpty()||alamat.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                }else{
                    mhsmodel.setmhsModel(nim, nama, alamat);
                    mhsdao.Insert(mhsmodel);
                    String dataMahasiswa[][] = mhsdao.readMahasiswa();
                    mhsview.tabel.setModel((new JTable(dataMahasiswa, mhsview.namaKolom)).getModel());
                }
            }
        });

        mhsview.delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = mhsview.getNim();
                String nama = mhsview.getNama();
                String alamat = mhsview.getAlamat();
                if(nim.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Masukkan NIM terlebih dahulu jika ingin menghapus data");
                }else{
                    mhsmodel.setmhsModel(nim, nama, alamat);
                    mhsdao.Delete(mhsmodel);
                    String dataMahasiswa[][] = mhsdao.readMahasiswa();
                    mhsview.tabel.setModel((new JTable(dataMahasiswa, mhsview.namaKolom)).getModel());
                }
            }
        });
    }
}
