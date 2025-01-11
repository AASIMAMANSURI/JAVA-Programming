import java.util.Random;

public class coin {

    String face;

    public coin() {
        flip();
    }

    public void flip() {
        Random rand = new Random();
        Boolean ishead = rand.nextBoolean();

        if (ishead) {
            face = "head";
        } else {
            face = "tails";
        }

    }

    public String getface() {
        return face;
    }
}