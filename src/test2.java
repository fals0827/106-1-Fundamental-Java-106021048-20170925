
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float g = scn.nextFloat();
        System.out.println(Math.round(g/600f*10)/10f);
    }
}
