public class Penggajian {
    int gajiPokok;
    int gajiTunjanganjabatan;
    int gajiLembur;

    Penggajian(int gajiTunjanganjabatan, int gajiPokok, int gajiLembur){
        this.gajiPokok = gajiPokok;
        this.gajiTunjanganjabatan = gajiTunjanganjabatan;
        this.gajiLembur = gajiLembur;


    }

    void cetakPenggajian(int gajiLembur)
    {System.out.println("\n  gaji pokok =" + gajiPokok+ "\n  gaji tunjanganjabatan =" + gajiTunjanganjabatan + "\n gaji lembur =" + gajiLembur);


    }

}
