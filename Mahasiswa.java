package Tugas_Sesi_9;
public class Mahasiswa <N,Na,C>{
   public N nim;
   public Na name;
   public C clas;

    public  N getNim() {
        return nim;
    }
    public void setNim(N nim) {
        this.nim = nim;
    }
    public Na getName() {
        return name;
    }
    public void setName(Na name) {
        this.name = name;
    }
    public C getClas() {
        return clas;
    }
    public void setClas(C clas) {
        this.clas = clas;
    }

}
class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println("Nim Anda :" + m.getNim());
        System.out.println("Nama Anda :" + m.getName());
        System.out.println("Kelas Anda :" + m.getClas());
    }
}