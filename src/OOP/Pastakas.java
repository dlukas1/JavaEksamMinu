package OOP;

public class Pastakas {
    int tind;
/*
Pastakas получает значения строк для вывода и хранит переменную tindiKogus,
которая уменьшается после вывода сообщения
 */
//Конструктор принимает значение tindiKogus
    public Pastakas (int tindiKogus){
        this.tind = tindiKogus;
    }

    public void kirjuta(String kiri){

        if(tind > kiri.length()){
            System.out.println(kiri);
            tind =  tind - kiri.length();
        }else {
            //String S2 = S.substring(4,7); // S2 = "ет,"
            System.out.println(kiri.substring(0,tind));
        }

    }
    public void prindiPaljuTintiAlles(){
        System.out.println(tind);

    }
}
