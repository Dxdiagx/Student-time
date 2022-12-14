public class Kuyruk {
    Eleman dizi[];
    int bas,son;
    int boyut;

    public Kuyruk(int boyut) {
        this.boyut = boyut;
        dizi = new Eleman[boyut];
        bas =0;
       son = 0;

    }
    boolean bos(){

        return bas==son;

    }
    boolean dolu(){

        return bas==(son+1)%boyut;

    }

    void ekle(Eleman yeni){
        if (!dolu()){
            dizi[son]=yeni;
            son=(son+1)%boyut;

        }
    }

    Eleman sil(){
        if (!bos()){
            Eleman temp=dizi[bas];
            bas=(bas+1)%boyut;
            return temp;

        }
return null;
    }
}
