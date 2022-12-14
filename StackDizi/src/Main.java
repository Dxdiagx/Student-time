public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.ekle(new Eleman(1));
        stack.ekle(new Eleman(2));
        stack.ekle(new Eleman(3));
        stack.ekle(new Eleman(4));
        stack.ekle(new Eleman(5));
      stack.listele();

    }
}