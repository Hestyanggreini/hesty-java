class murid { 
        String nama_siswa, email_siswa, gender;
        int nomor_induk_siswa, nomor_telepon, usia, jumlah_pertemuan_yang_diikuti; 

        public murid(String nama_siswa,int nomor_telepon, int usia, String email_siswa, String gender, int jumlah_pertemuan_yang_diikiuti, int nomor_induk_siswa){
            this.nama_siswa = nama_siswa;
            this.nomor_telepon = nomor_telepon;
            this.usia = usia;
            this.email_siswa = email_siswa; 
            this.gender = gender;
            this.nomor_induk_siswa = nomor_induk_siswa;
        }
        
        String getsiswa(){ 
            return "nama siswa : " + nama_siswa;
        }
       int getnomor(){
           return nomor_telepon;
       }  
       int setusia(){
           return usia;
       } 
       String getemail(){
           return "email siswa : " + email_siswa;
       }
       String getgender(){
           return "gender : " + gender;
       }
       int setjumlah(){
        return jumlah_pertemuan_yang_diikuti;

       }
       int setinduk(){
        return nomor_induk_siswa;
       }
    }
    public class coba { 
        public static void main(String[] args) {
            murid murid1 = new murid("Hesty", 109629, 20,"hesty@gmail.com","wanita",3, 1099);
            System.out.println(murid1.getsiswa());
            System.out.println("Nomor Telepon: " +murid1.getnomor());
            System.out.println("usia: " +murid1.setusia());
            System.out.println(murid1.getemail());
            System.out.println(murid1.getgender());
            System.out.println("jumlah pertemuan yang diikuti: " +murid1.setjumlah());
            System.out.println("nomor induk siswa: " + murid1.setinduk());



        }
}








