import java.util.ArrayList;
import java.util.Scanner;
class Skammstöfun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tall = sc.nextInt();
        String[] settning = new String[tall];
        int i=0;
        String[] ikke = {"am","is", "an", "as", "at", "by", "do", "go", "if", "in", "it", "my", "no", "of", "on", "or", "so", "to", "up", "us", "and", "we"};
        while(sc.hasNext()){
            settning[i] = sc.next();
            i++;
        }
        ArrayList<String> bokstaver= new  ArrayList<>();
        for (String ord : settning){
            bokstaver.add(ord.substring(0,1));
            for (String ikk : ikke){
                if (ord.equals(ikk)){
                    bokstaver.removeLast();
                }
            }

        }
        String out = "";
        for (String bok: bokstaver){
            out+= bok;
        }
        System.out.println(out);


        
        
    }
}