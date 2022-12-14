package entities;

import abstarct.etobur;
import abstarct.kedigil;

public class kaplan extends kedigil {
    abstarct.etobur etobur;
    public kaplan() {
        this.etobur = etobur;
    }

    void seslen(etobur etobur){
        etobur.seslen();
    }
}
