

import java.util.ArrayList;
import java.util.Scanner;
class Fjoldibokstafa {
    public static void main(String[] args) {
        ArrayList<Character> bok = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            bok.add(ch);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            bok.add(ch);
        }
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        char[] inparr = inp.toCharArray();
        int ant = 0;
        for (char boks:inparr){
            for (char feil: bok){
                if(boks == feil){
                   ant++; 
                }
            }
        }
        System.out.print(ant);
    }
}