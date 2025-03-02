import java.util.ArrayList;

/**
 * @author jzwu
 * @since 2024-12-05
 */
public class Run {
    static final int SIZE = 1024000000 * 1024000000 * 1024000000;

    public static void main(String[] args) {
        //int[] ints = new int[SIZE];
        //System.out.println("Hello, World!");
        ArrayList<int[]> ints = new ArrayList<>();
        while (true){
            ints.add(new int[1000000]);
        }
    }
}
