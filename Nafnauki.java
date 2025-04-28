import java.util.Scanner;
class Nafnauki{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        
        int ind = str.indexOf(".");    
        
        for (int i = ind; i < str.toCharArray().length; i++) {
            System.out.print(str.toCharArray()[i]);
            
        }
    }
}