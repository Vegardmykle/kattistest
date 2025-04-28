import java.util.Scanner;
class Kínahvísl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String org = sc.next();
        String siste = sc.next();

        char[] orgChar= org.toCharArray();
        char[] sisteChar = siste.toCharArray();
        int out = 1;
        for (int i= 0; i< orgChar.length;i++) {
            if(sisteChar[i]!= orgChar[i]){
                out++;
            }
        } 
        System.out.println(out);
    }
}