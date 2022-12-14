public class Main {
    public static void main(String[] args) {


        TekYönlü tekYönlü=new TekYönlü();
        tekYönlü.Basa_Ekle(new Eleman(1));
        tekYönlü.Basa_Ekle(new Eleman(2));
        tekYönlü.Basa_Ekle(new Eleman(4));
        tekYönlü.Basa_Ekle(new Eleman(6));
        tekYönlü.Basa_Ekle(new Eleman(4));
        tekYönlü.Sona_Ekle(new Eleman(5));
        tekYönlü.listeyi_Goster();
        System.out.println();
        tekYönlü.enbBulSonaAt();
        tekYönlü.listeyi_Goster();



    }
}