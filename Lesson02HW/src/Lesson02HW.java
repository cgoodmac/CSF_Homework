import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lesson02HW {

    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student names (comma separated)");
        String s = scanner.nextLine();
        List<String> list = new ArrayList<String>(Arrays.asList(s.split(", ")));
        shuffleList(list);
        splitPrintList(list);
    }

    private static void shuffleList(List<String> list){
        int n = list.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++ ){
            int change = i + random.nextInt(n - i);
            swap(list, i, change);
        }
    }

    private static void swap(List<String> list, int i, int change) {
        String helper = list.get(i);
        list.set(i, list.get(change));
        list.set(change, helper);
    }

    private static void splitPrintList(List<String> list){
        int size = list.size();
        for (int i = 0; i < size; i+= 2) {
            if (i < size - 1){
                String one = list.get(i);
                String two = list.get(i+1);
                System.out.print(one + " & " + two + "\n");
            }  else  {
                String one = list.get(i);
                System.out.print(one + "\n");
            }
        }
    }


}
