public class Sıralama {
Stack2 stack2=new Stack2();
    void Sırala(Stack stack){
  Eleman temp=stack.bas.ileri;
  Eleman temp2=stack.bas;
         while (temp!=null){
             temp2=temp;
             if (temp.icerik< temp2.icerik){
                 stack2.ekle(temp.icerik);
                 temp2=temp;
                 temp=temp.ileri;

             }
             temp=temp.ileri;
         }
         return;
    }
}
