import java.util.Random;

public class main {

    public static void main(String[] args) {
        System.out.print("Hello world!");
        Random rand = new Random();

        while (true) {
            int a = rand.nextInt(2, 5);
            System.out.println(a + "  ");
        }

    }

}
