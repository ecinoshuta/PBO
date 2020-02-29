package com.tugas;

import javax.swing.*;

public class Form extends JFrame{
    JLabel lHeader, lName, lNim, lJk, lReligion, lAddress;
    JTextField tName, tNim;
    JRadioButton rMale, rFemale;
    JComboBox cReligion;
    JTextArea tAddress;
    JButton Submit;
    String[] religion = {"Islam", "Kristen", "Hindu", "Budha"};

    public void displayForm() {
        setTitle("Data Personalia");
        lHeader = new JLabel("Data Diti Mahasiswa");
        lName = new JLabel("Nama");
        tName = new JTextField();
        lNim = new JLabel("NIM");
        tNim = new JTextField();
        lJk = new JLabel("Jenis Kelamin");
        rMale = new JRadioButton("Laki-Laki");
        rFemale = new JRadioButton("Perempuan");
        lReligion = new JLabel("Agama");
        cReligion = new JComboBox(religion);
        lAddress = new JLabel("Alamat");
        tAddress = new JTextArea();
        Submit = new JButton("Submit");

        ButtonGroup jk = new ButtonGroup();
        jk.add(rMale);
        jk.add(rFemale);

        setLayout(null);
        add(lHeader);
        add(lName);
        add(tName);
        add(lNim);
        add(tNim);
        add(lJk);
        add(rMale);
        add(rFemale);
        add(lReligion);
        add(cReligion);
        add(lAddress);
        add(tAddress);
        add(Submit);

        lHeader.setBounds(200,30,250,30);
        lName.setBounds(100,70,100,30);
        tName.setBounds(230, 70, 200,25);
        lNim.setBounds(100,100,100,30);
        tNim.setBounds(230,100,200,25);
        lJk.setBounds(100,130, 100,30);
        rMale.setBounds(225,130,100, 30);
        rFemale.setBounds(325,130,100, 30);
        lReligion.setBounds(100, 160, 100, 30);
        cReligion.setBounds(230, 162,100,25);
        lAddress.setBounds(100, 195, 100, 30);
        tAddress.setBounds(230,195,200,50);
        Submit.setBounds(200,290,75,30);


        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



}
