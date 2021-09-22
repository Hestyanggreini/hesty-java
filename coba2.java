class guru { 
    String nama_guru, bidang_keahlian, email_les_online;
    int nomor_telepon, harga, jumlah_pertemuan_diadakan;

    public guru(String nama_guru, String bidang_keahlian, String email_les_online, int nomor_telepon, int harga, int jumlah_pertemuan_diadakan){
        this.nama_guru = nama_guru;
        this.bidang_keahlian = bidang_keahlian;
        this.email_les_online = email_les_online;
        this.nomor_telepon = nomor_telepon;
        this.harga = harga;
        this.jumlah_pertemuan_diadakan = jumlah_pertemuan_diadakan;
    }

    String getguru(){ 
        return "nama guru : " + nama_guru;
    }
    String getkeahlian(){
        return "bidang keahlian : " + bidang_keahlian;
    }
    String getemail(){
        return " email les online : " + email_les_online;
    }
    int setnomor(){
        return nomor_telepon;
    } 
    int setharga(){
        return harga;
    }  
    int getjumlah(){
        return jumlah_pertemuan_diadakan;
    }
}
public class coba2{ 
    public static void main(String[] args) {
        guru guru1 = new guru("risky", "ipa","risky@gmail.com",20869, 50000, 4);
        System.out.println(guru1.getguru());
        System.out.println(guru1.getguru());
        System.out.println(guru1.getemail());
        System.out.println("Nomor Telepon: " +guru1.setnomor()); 
        System.out.println("Harga : " +guru1.setharga());
        System.out.println("Jumlah Pertemuan  : " +guru1.getjumlah());



    }
}
