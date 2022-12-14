public class Main {
    public static void main(String[] args) {
        Eleman eleman0=new Eleman(1);
        Eleman eleman1=new Eleman(2);
        Eleman eleman2=new Eleman(3);
        Eleman eleman3=new Eleman(4);
        Eleman eleman4=new Eleman(5);
        Eleman eleman5=new Eleman(6);
        Eleman eleman6=new Eleman(7);

        Kuyruk kuyruk=new Kuyruk(7);
        kuyruk.ekle(eleman0);
        kuyruk.ekle(eleman1);
        kuyruk.ekle(eleman2);
        kuyruk.ekle(eleman3);
        while (!kuyruk.bos()){

            Eleman k=kuyruk.sil();
            System.out.println(k.icerik);
        }

    }
}