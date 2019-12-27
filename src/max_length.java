import java.util.Scanner;

public class max_length {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine() + " !!&&!!";
        Scanner strScanner = new Scanner(str);
        String word = strScanner.next(), max = word;
        while(true){
            word = strScanner.next();
            if (word.compareTo("!!&&!!") == 0) {
                System.out.println("последнее слово максимальной длины:"+max);
                return;
            }
            else if (word.length() >= max.length()) max = word;
        }
    }
}
