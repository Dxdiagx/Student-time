public class Stack {
    Eleman bas;

    public Stack() {
        bas = null;

    }

    boolean bos() {

        return bas == null;

    }

    void ekle(Eleman yeni) {

        if (!bos()) {

            yeni.ileri = bas;
            bas = yeni;
        } else {
            bas = yeni;
        }
    }

    Eleman sil() {
        Eleman temp = bas;
        if (!bos()) {
            bas.ileri = bas;
            return temp;
        }
        return null;
    }

    public void listele() {
        Eleman temp = bas;
        if (!bos()) {
            while (temp != null) {
                System.out.println(temp.icerik);
                temp = temp.ileri;
            }
        } else {
            System.out.println("Stack/Yığıt boş");
        }
    }

}
