public class Data_pegawai {
    String Nama, Alamat, Gaji, Jabatan, StatusPendidikan;
    String TTL;

    Data_pegawai(String Nama, String ttl, String Alamat, String Gaji, String Jabatan, String statusPendidikan){
        this.Nama= Nama;
        this.Alamat= Alamat;
        this.Gaji= Gaji;
        this.Jabatan= Jabatan;
        this.StatusPendidikan= statusPendidikan;
        this.TTL=ttl;

    }


    void  cetakdata_pegawai (String Nama) {System.out.println(" Nama = " + Nama+
            "\n  Alamat =" + Alamat +
            "\n  Gaji =" + Gaji +
            "\n  Jabatan=" + Jabatan+
            "\n  TTL=" + TTL +
            "\n  StatusPendidikan=" + StatusPendidikan);}
}
