public class mainApp {
    public static void main(String[] args) {

        Data_pegawai Data_pegawai=new Data_pegawai("Aprinia","04 April 2002","Penujak","1000000","Manajer","S1");

        Data_pegawai.cetakdata_pegawai(Data_pegawai.Nama);



        Penggajian penggajian= new Penggajian(20000000,10000000,100000);

        penggajian.cetakPenggajian(penggajian.gajiPokok);



        Jabatan Jabatan= new Jabatan("Back and","Frond and","umum");

        Jabatan.cetakjabatan(Jabatan.Devlover);


        Pendidikan Pendidikan=new Pendidikan("Serjana Komputer","Magister Komputer");

        Pendidikan.cetakPendidikan(Pendidikan.S1);

    }
}
