public class Jabatan {
    String Devlover;
    String Manajer;
    String Bendahara;

    Jabatan(String Devlover, String Manajer, String Bendahara){
        this.Devlover = Devlover;
        this.Manajer = Manajer;
        this.Bendahara = Bendahara;
    }

    void  cetakjabatan(String Manajer){

        System.out.println("Manajer="+ Manajer + "\n  Devlover="+ Devlover  + "\n  Bendahara=" + Bendahara);
    }
}
