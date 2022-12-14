public class Stack2 {
    Eleman2 bas;

    public Stack2() {
        bas = null;

    }

    boolean bos() {

        return bas == null;

    }

    void ekle(int yeni) {
Eleman2 eleman2=new Eleman2(yeni);
        if (!bos()) {

            eleman2.ileri = bas;
            bas = eleman2;
        } else {
            bas = eleman2;
        }
    }

    Eleman2 sil() {
        Eleman2 temp = bas;
        if (!bos()) {
            bas.ileri = bas;
            return temp;
        }
        return null;
    }

    public void listele() {
        Eleman2 temp = bas;
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
