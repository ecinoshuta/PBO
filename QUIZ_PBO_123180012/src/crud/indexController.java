package crud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class indexController {
    indexView indexview;
    indexModel indexmodel;
    indexDAO indexdao;
    public indexController(indexView indexview, indexModel indexmodel, indexDAO indexdao){
        this.indexview=indexview;
        this.indexmodel=indexmodel;
        this.indexdao=indexdao;

        if(indexdao.getJmldata() != 0){
            String dataInti[][] = indexdao.readData();
            indexview.tabel.setModel((new JTable(dataInti, indexview.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        indexview.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                super.mousePressed(e);
                int baris = indexview.tabel.getSelectedRow();
                int kolom = indexview.tabel.getSelectedColumn();

                String judul = indexview.tabel.getValueAt(baris, 2).toString();
                indexview.txjudul.setText(judul);
                String tipe = indexview.tabel.getValueAt(baris, 3).toString();
                indexview.txtipe.setText(tipe);
                String episode = indexview.tabel.getValueAt(baris, 4).toString();
                indexview.txepisode.setText(episode);
                String genre = indexview.tabel.getValueAt(baris, 5).toString();
                indexview.txgenre.setText(genre);
                String rating = indexview.tabel.getValueAt(baris, 7).toString();
                indexview.txrating.setText(rating);
            }
        });

        indexview.refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataInti[][] = indexdao.readData();
                indexview.tabel.setModel((new JTable(dataInti, indexview.namaKolom)).getModel());
            }
        });

        indexview.create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = indexview.getJudul();
                String tipe = indexview.getTipe();
                String episode = indexview.getEpsiode();
                String genre = indexview.getGenre();
                String status = indexview.getStatus();
                String rating = indexview.getRating();
                String cari = indexview.getCari();
                if(judul.isEmpty() || tipe.isEmpty() || episode.isEmpty() || genre.isEmpty() || status.isEmpty() || rating.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap Isi Semua Field");
                }else{
                    indexmodel.setindexModel(judul, tipe, status, episode, rating, genre, cari);
                    indexdao.Create(indexmodel);

                    String dataInti[][] = indexdao.readData();
                    indexview.tabel.setModel((new JTable(dataInti,indexview.namaKolom)).getModel());
                }
            }
        });

        indexview.update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = indexview.getJudul();
                String tipe = indexview.getTipe();
                String episode = indexview.getEpsiode();
                String genre = indexview.getGenre();
                String status = indexview.getStatus();
                String rating = indexview.getRating();
                String cari = indexview.getCari();
                if(judul.isEmpty() || tipe.isEmpty() || episode.isEmpty() || genre.isEmpty() || status.isEmpty() || rating.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap Isi Semua");
                }else{indexmodel.setindexModel(judul, tipe, status, episode, rating, genre, cari);
                    indexdao.Update(indexmodel);

                    String dataInti[][] = indexdao.readData();
                    indexview.tabel.setModel((new JTable(dataInti,indexview.namaKolom)).getModel());
                }
            }
        });

        indexview.delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = indexview.getJudul();
                String tipe = indexview.getTipe();
                String episode = indexview.getEpsiode();
                String genre = indexview.getGenre();
                String status = indexview.getStatus();
                String rating = indexview.getRating();
                String cari = indexview.getCari();
                if(judul.isEmpty() || tipe.isEmpty() || episode.isEmpty() || genre.isEmpty() || status.isEmpty() || rating.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap Isi Semua Field");
                }else{
                    indexmodel.setindexModel(judul, tipe, status, episode, rating, genre, cari);
                    indexdao.Delete(indexmodel);

                    String dataInti[][] = indexdao.readData();
                    indexview.tabel.setModel((new JTable(dataInti,indexview.namaKolom)).getModel());
                }
            }
        });

        indexview.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Terima Kasih");
                System.exit(0);
            }
        });

        indexview.search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = indexview.getJudul();
                String tipe = indexview.getTipe();
                String episode = indexview.getEpsiode();
                String genre = indexview.getGenre();
                String status = indexview.getStatus();
                String rating = indexview.getRating();
                String cari = indexview.getCari();
                if(cari.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap Isi Data yang Ingin Dicari");
                }else{
                    indexmodel.setindexModel(judul, tipe, status, episode, rating, genre, cari);
                    indexdao.searchData(indexmodel);
                }
            }
        });
    }
}
