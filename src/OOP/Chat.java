package OOP;

import java.util.HashMap;

public class Chat {

String roomName;
HashMap <String, String> chatData = new HashMap<>();
    int i = 1;


    public  void  sisestaSonum (String nimi, String sonum) {

    chatData.put(i + nimi,sonum);
        i++;
    }

    public Chat(String toaNimi){
        this. roomName = toaNimi;
    }

    public  void prindiKoikSonumidKoosKasutajanimega(){
        System.out.println(chatData);
    }

    public void adminKustutabSonumi(String sonum){
        chatData.remove(sonum);
}
    public void prindiToaNimi(){
    System.out.println(roomName);
}

}
