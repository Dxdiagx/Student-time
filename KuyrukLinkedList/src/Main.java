public class Main {
    public static void main(String[] args) {
        Kuyruk kuyruk = new Kuyruk();

        kuyruk.ekle(new Eleman(1));
        kuyruk.ekle(new Eleman(2));
        kuyruk.ekle(new Eleman(3));
        kuyruk.ekle(new Eleman(4));

        while (!kuyruk.bos()) {
            Eleman k = kuyruk.sil();
            System.out.println(k.icerik);

        }
    }
}