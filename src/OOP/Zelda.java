package OOP;


public class Zelda {
    int elud;
    public  Zelda (int elusid) {
        this.elud = elusid;
    }

    public void kaklusKolliga(int kollilElusid){
        elud = elud = kollilElusid;
    }
    public void prindiMituEluAlles (){
        System.out.println("On jaanud " + elud + " elusid");
    }
public void prindiKasOnElus (){
    if (elud > 0){
        System.out.println("On elus");
    } else {
        System.out.println("On surnud");
    }
}

}
