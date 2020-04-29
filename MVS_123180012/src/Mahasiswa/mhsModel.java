package Mahasiswa;

public class mhsModel {
        private String nim, nama, alamat;

        public void setmhsModel(String nnim,String nnama, String aalamat){
            this.nim = nnim;
            this.nama = nnama;
            this.alamat = aalamat;
        }

        public String getNim(){
            return nim;
        }
        public void getNim(String nim){
            this.nim = nim;
        }
        public String getNama(){
            return nama;
        }
        public void getNama(String nama){
            this.nama = nama;
        }
        public String getAlamat(){
            return alamat;
        }
        public void getAlamat(String alamat){
            this.alamat = alamat;
        }
}
