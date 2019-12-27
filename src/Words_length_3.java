import java.util.Scanner;

public class Words_length_3 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine() + " !!&&!!";
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next();
        int sch = 0;
        while (word.compareTo("!!&&!!") != 0){
            sch++;
            if(word.length() == 3) System.out.println(sch);
            word = strScanner.next();
        }
        //System.out.println("Количество слов длинной 3 = "+sch);
    }

}
