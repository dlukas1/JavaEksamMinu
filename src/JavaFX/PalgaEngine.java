package JavaFX;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import java.util.HashMap;
import java.util.Optional;

public class PalgaEngine {

    Pane pane;
    int palk;
    HashMap<String, Integer> kulud = new HashMap<>();
    int sum = 0;
    Button lisa = new Button("ok");


    public PalgaEngine(Pane panes) {
        pane = panes;


        askPalk();
        sinuKulud();
    }

    private void askPalk() {
        TextField f1 = new TextField("Sinu palk: ");

        lisa.setTranslateX(150);
        pane.getChildren().addAll(f1, lisa);
        lisa.setOnAction(event -> {
            String palkString = f1.getText();
            palk = Integer.parseInt(palkString);
            System.out.println(palk);
        });
    }

    private void sinuKulud() {
        Button sisestaKulud = new Button(" Sisesta uus kulu");
        sisestaKulud.setTranslateY(200);
        pane.getChildren().add(sisestaKulud);
        sisestaKulud.setOnAction(event -> {
            TextInputDialog dialog = new TextInputDialog("uus kulu");
            dialog.setTitle("Kulude lisamine");
            dialog.setHeaderText("lalala");
            dialog.setContentText("sisesta uus kulu:");
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                String sisestatud = result.get();
                String []sis = sisestatud.split(",");
                String nimi = sis[0];
                int hind = Integer.parseInt(sis[1]);
                
                if (palk > hind) {
                    sum = sum + hind;
                    if (sum>palk){
                        hoiatus();
                    }else {
                        kulud.put(nimi,hind);
                    }

                } else {
                    hoiatus();
                }
            }


        });
    }

    private void hoiatus() {
        TextInputDialog dialog2 = new TextInputDialog("Hoiatus");
        dialog2.setTitle("Raha on otsas, midagi on vaja eemalda!");
        dialog2.setHeaderText(""+kulud);
        dialog2.setContentText("Mida kustutame : ");

        Optional<String> result = dialog2.showAndWait();
        if (result.isPresent()) {
           kulud.remove(result.get());
            System.out.println(kulud);
        }

    }
}

