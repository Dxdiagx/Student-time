public class Stack {
    Eleman dizi[];
    int boyut;
    int ustDeger;

    public Stack(int boyut){
        this.dizi = new Eleman[boyut];
        this.boyut = boyut;
        ustDeger = -1;
    }
    boolean bos(){
        return ustDeger==-1;

    }
    boolean dolu(){
        return ustDeger==boyut-1;

    }

    void ekle(Eleman yeni){

 if (!dolu()){
     ustDeger++;
     dizi[ustDeger]=yeni;
 }

    }

    Eleman sil(){
       Eleman silinen=dizi[ustDeger];
         ustDeger--;
         return silinen;

    }
    public void listele(){
        int i = ustDeger;
        if(!bos()){
            while(i != -1){
                System.out.println(dizi[i].icerik);
                i--;
            }
        }
        else{
            System.out.println("Stack/Yığıt boş");
        }
    }

}
