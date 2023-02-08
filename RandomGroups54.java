import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomGroups54{
    public static void main(String[] args) {
        System.out.println("works fine");

        System.out.println(readStu());
        System.out.println("V2");
    }

    public static ArrayList<String> readStu(){
        ArrayList<String> arr = new ArrayList<>();

        try {
            File f =new File("Student List.txt");
            Scanner sc =new Scanner(f);
            while(sc.hasNext()){
                arr.add(sc.next());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arr;
    }
}