package ErinevadAsjad;

/**
 * Created by Dmitry on 23.01.2017.
 */
public class TimeMain {
    public static void main(String[] args) {
        TimeClass time = new TimeClass();

        time.setTime(13,27,6);
        System.out.println(time.toMilitary());
        System.out.println(time.toString());

    }
}
