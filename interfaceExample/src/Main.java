import abstarct.etobur;
import entities.ayı;
import entities.kaplan;

public class Main {
    public static void main(String[] args) {
ayı ayı=new ayı();
kaplan ibneEmin=new kaplan();
        etobur etoburAyı=new ayı();
        etobur etoburKaplan=new kaplan();
        etoburAyı.seslen();

        for (int i=0; i<10; i++){
            etoburKaplan.seslen();
        }

    }
}