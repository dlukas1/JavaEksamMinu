package OOP;

import java.util.ArrayList;


public class Chat {

String roomName;
ArrayList chatData = new ArrayList();
    int i = 0;

    public  void  sisestaSonum (String nimi, String sonum) {

    chatData.add(i, nimi + ": " + sonum);
        i++;
    }

    public Chat(String toaNimi){
        this. roomName = toaNimi;
    }

    public  void prindiKoikSonumidKoosKasutajanimega() {
        chatData.stream().forEach(System.out::println);
    }


    public void adminKustutabSonumi(String erase){

        chatData.remove(erase );
}

    public void prindiToaNimi(){
    System.out.println(roomName);
}

}
