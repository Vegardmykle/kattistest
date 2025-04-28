import java.util.Scanner;
class Lettasta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prob = sc.nextInt();
        String[] navn;
        
        int antT = sc.nextInt();
        int[] poeng = new int[antT];
        
        String[] poengS;
        
        String probelmString = sc.next();
        String poengInt = sc.next();
        
        navn = probelmString.split(" ");
        poengS = poengInt.split(" ");

        for (int i = 0; i<antT;i++) {
            poeng[i] = Integer.parseInt(poengS[i]);
        }


    }        
}