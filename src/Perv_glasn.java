import java.util.Scanner;


public class Perv_glasn {
    public static void main (String args []) {
        int sch = 0;
        Scanner in = new Scanner(System.in);
        String str = " " + in.nextLine();
        char[] letters = new char[]{'а' , 'я', 'о', 'ё', 'у', 'ю', 'ы', 'и', 'э', 'е'};
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == ' '){
                for (int j = 0; j < letters.length; j++) {
                    if(str.charAt(i + 1) == letters[j]) sch++;
                }
            }
        }
        System.out.println("Количество слов, начинающихся с гласной буквы = "+sch);
    }

}
