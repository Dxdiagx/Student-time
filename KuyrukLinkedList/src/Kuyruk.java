
public class Kuyruk {
    Eleman bas, son;

    boolean bos() {
        return bas ==null;

    }

    void ekle(Eleman yeni) {
        if (bos()) {
            bas = yeni;
            son = yeni;

        } else {
            son.ileri = yeni;
            son = yeni;
        }
    }

    Eleman sil() {
        Eleman sonuc = bas;
        if (!bos()) {

            bas = bas.ileri;
            if (bas == null) son = null;
        }
        return sonuc;

    }
}
