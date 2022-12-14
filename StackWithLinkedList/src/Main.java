public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
Stack2 stack2=new Stack2();
        stack.ekle(new Eleman(1));
        stack.ekle(new Eleman(2));
        stack.ekle(new Eleman(5));
        stack.ekle(new Eleman(4));
Sıralama sıralama=new Sıralama();
        stack.listele();
        sıralama.Sırala(stack);
        System.out.println("---------------");
    stack2.listele();
    }
}