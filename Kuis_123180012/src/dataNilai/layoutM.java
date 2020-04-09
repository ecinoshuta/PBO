package dataNilai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

public class layoutM extends JFrame {
    JLabel tnim, tnama, tmatkul1, tmatkul2, tnilai1, tnilai2;
    JTextField inim, inama, imatkul1, imatkul2, inilai1, inilai2;
    JButton convert;
    Statement statement;
    public void layoutM()
    {
        setTitle("Hitung Nilai"); //untuk menentukan judul atau nama GUI
        tnim = new JLabel("NIM");
        tnama = new JLabel("Nama");
        tmatkul1 = new JLabel("Mata Kuliah 1");
        tnilai1 = new JLabel("Nilai 1");
        tmatkul2 = new JLabel("Mata Kuliah 2");
        tnilai2 = new JLabel("Nilai 2");
        convert = new JButton("Convert");
        inim = new JTextField();
        inama = new JTextField();
        imatkul1 = new JTextField();
        inilai1 = new JTextField();
        imatkul2 = new JTextField();
        inilai2 = new JTextField();

        setLayout(null);
        add(tnim);
        add(inim);
        add(tnama);
        add(inama);
        add(tmatkul1);
        add(imatkul1);
        add(tnilai1);
        add(inilai1);
        add(tmatkul2);
        add(imatkul2);
        add(tnilai2);
        add(inilai2);
        add(convert);

        tnim.setBounds(20,30,100,20);
        inim.setBounds(140,30,175,20);
        tnama.setBounds(20,65,100,20);
        inama.setBounds(140,65,175,20);
        tmatkul1.setBounds(20,100,100,20);
        imatkul1.setBounds(140,100,175,20);
        tnilai1.setBounds(20,135,100,20);
        inilai1.setBounds(140,135,175,20);
        tmatkul2.setBounds(20,170,100,20);
        imatkul2.setBounds(140,170,175,20);
        tnilai2.setBounds(20,205,100,20);
        inilai2.setBounds(140,205,175,20);
        convert.setBounds(150,240,90,20);

        setSize(400,330);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Long nim = Long.parseLong(inim.getText());
                    String nama = inama.getText();
                    String matkul1 = imatkul1.getText();
                    Float nilai1 = Float.parseFloat(inilai1.getText());
                    String matkul2 = imatkul2.getText();
                    Float nilai2 = Float.parseFloat(inilai2.getText());
                    Float mean = (nilai1 + nilai2) / 2;

                    System.out.println("NIM  :" + nim);
                    System.out.println("Nama :" + nama);
                    System.out.println("Mata Kuliah 1 :" + matkul1);
                    System.out.println("Mata Kuliah 2 :" + matkul2);

                    rataRata rata = new rataRata();
                    rata.rata(nilai1, nilai2);
                    

                    konversiNilai nilai = new konversiNilai();
                    nilai.konversi(mean);


                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(rootPane, "Konversi Gagal, Coba Lagi");
                }finally {
                    JOptionPane.showMessageDialog(rootPane, "Konversi Sukses");
                }
            }
        });

    }

}
