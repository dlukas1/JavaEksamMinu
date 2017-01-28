package JavaFX;
import javafx.geometry.Orientation;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class SliCirOOP {

    int x;
    int y;

    StackPane stack;
    final Slider sliderX = new Slider(0, 250, 50);
    final Slider sliderY = new Slider(0, 250, 50);
    final Ellipse ellipse = new Ellipse(x,y);

    public SliCirOOP (StackPane stacks){
        stack = stacks;
        joonistaSliderid ();
        saaMootmed();
        joonistaEllips();
    }

    private void joonistaSliderid () {
        sliderX.setOrientation(Orientation.HORIZONTAL);
        sliderY.setOrientation(Orientation.VERTICAL);
        sliderX.setTranslateY(-230);
        sliderY.setTranslateX(230);
        stack.getChildren().addAll(sliderX,sliderY);
    }

    public void saaMootmed (){
        sliderX.valueProperty().addListener((observable, vanaVaartus, uusVaartusX) -> {
           x = uusVaartusX.intValue();
            System.out.println(x);
            ellipse.setRadiusX(x);
            if (x>200){
                ellipse.setFill(Color.GREEN);
            }else {
                ellipse.setFill(Color.RED);
            }
        });

        sliderY.valueProperty().addListener((observable, vanaVaartus, uusVaartusY) -> {
            y = uusVaartusY.intValue();
            System.out.println(y);
            ellipse.setRadiusY(y);
            if (y>100){
                ellipse.setFill(Color.YELLOW);
            }else {
                ellipse.setFill(Color.RED);
            }
        });
    }

    private void joonistaEllips ()
    {
        stack.getChildren().add(ellipse);
    }


}
