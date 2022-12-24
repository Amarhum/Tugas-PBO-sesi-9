package Tugas_Sesi_9;
import java.util.ArrayList;
public class TugasArrayList {
    String matkul;
    String dosen;
    String jam;
    
    public void setValue(String matkul,String dosen,String jam){
        this.matkul = matkul;
        this.dosen = dosen;
        this.jam = jam;
    }
    public String getMatkul(){
        return matkul;
    }
    public String getDosen(){
        return dosen;
    }
    public String getJam(){
        return jam;
    }

    public void infoJadwal(){
        System.out.println("Mata Kuliah : "+getMatkul());
        System.out.println("Dosen : "+getDosen());
        System.out.println("Jam : "+getJam());
        System.out.println("");
    }
}
class Jadwal{
    public static void main(String[] args) {
        TugasArrayList jadwal1 = new TugasArrayList();
        jadwal1.setValue("PBO", "Pak alun master koding", "16.00 - 19.00");
        TugasArrayList jadwal2 = new TugasArrayList();
        jadwal2.setValue("RPL", "Bu Dwi", "13.00 - 16.00");
        TugasArrayList jadwal3 = new TugasArrayList();
        jadwal3.setValue("Basis Data", "Bu Dwi", "08.00 - 10.00");

        ArrayList<TugasArrayList> jadwalku = new ArrayList<>(); 
        jadwalku.add(jadwal1);
        jadwalku.add(jadwal2);
        jadwalku.add(jadwal3);


        for (TugasArrayList jadwal :jadwalku){
            jadwal.infoJadwal();
        }
    }
}
