package dataNilai;

public class konversiNilai extends rataRata
{
    private String huruf;

    public void konversi(Float ratarata) {
        ratarata = Float.parseFloat(String.valueOf(ratarata));
        huruf = huruf (ratarata);

        System.out.println("Nilai huruf   :" + huruf);
    }


    private String huruf(float mean) {
        if (mean > 80 && mean <= 100) return  "A";
        else if (mean >= 75 && mean < 80) return  "B+";
        else if (mean >= 65 && mean < 75) return "B";
        else if (mean >= 60 && mean < 65) return  "C+";
        else if (mean >= 50 && mean < 60) return  "C";
        else if (mean >= 20 && mean < 50) return  "D";
        else if (mean >= 0 && mean < 20) return  "E";
        else return  "Error";
    }
}

