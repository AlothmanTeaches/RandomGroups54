import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomGroups54{
    public static void main(String[] args) {
        
        System.out.println("works fine");
        System.out.println("The second Dev. edited here");


        System.out.println(readStu());
        System.out.println("V5");
        randGroups(readStu(), 5);
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

    public static void randGroups(ArrayList<String> stu, int numGroups){
        Collections.shuffle(stu);
        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        for(int i = 0 ; i < numGroups; i++){
            groups.add(new ArrayList<>());
        }
        for(int i = 0 ; i < stu.size(); i++){
            groups.get(i%numGroups).add(stu.get(i));
        }

        System.out.println(groups);
    }
}