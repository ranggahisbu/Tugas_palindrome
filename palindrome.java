import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner (System.in);

        String kata;
        String kataPalindrome = "";
        int panjangKata;

        System.out.println("Apakah kata ini palindrome?");

        System.out.print("Kata : ");

        kata = input.nextLine();
        panjangKata = kata.length();

        for (int i = panjangKata -1; i >= 0; i--){
            kataPalindrome = kataPalindrome + kata.charAt(i);
        }
            if (kata.equals(kataPalindrome)){
                System.out.println("Nahhh kata " + kata + " ini termasuk palindrome");

            }

        else {
            System.out.println("Kalau kata " + kata + " ini bukan palindrome");
        }

            input.close();

    }
}