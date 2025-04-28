import java.util.Scanner;
class Fallingsnow2{
    int antRad;
    int antKol;
    char[][] ikkefalt;
        public void  sno(){
            Scanner sc = new Scanner(System.in);
            int rad = sc.nextInt();
            int kol = sc.nextInt();
            this.antKol = kol;
            this.antRad = rad;
            sc.nextLine();
            char[][] ut = new char[rad][kol]; 
            for (int i = 0; i <rad; i++) {
                
                    String str = sc.next();
                    ut[i] = str.toCharArray();   
            }

            this.ikkefalt = ut;
            sc.close();
        }

        public void falt(){
            char[][] ut = new char[antRad][antKol];
        
        // Først kopierer vi alle punktene som de er
        for (int i = 0; i < antRad; i++) {
            for (int j = 0; j < antKol; j++) {
                ut[i][j] = ikkefalt[i][j];
            }
        }
        
        // Så lar vi snøen falle
        for (int kol = 0; kol < antKol; kol++) {
            for (int rad = antRad - 1; rad >= 0; rad--) {
                if (ikkefalt[rad][kol] == 'S') {
                    // Finn nederste ledige plass i denne kolonnen
                    int nyRad = rad;
                    while (nyRad + 1 < antRad && ut[nyRad + 1][kol] == '.') {
                        nyRad++;
                    }
                    
                    if (nyRad != rad) {
                        ut[rad][kol] = '.';
                        ut[nyRad][kol] = 'S';
                    }
                }
            }

        }
         for (int i = 0; i < antRad; i++) {
            System.out.println("\n");
            for (int j = 0; j < antKol; j++) {
                System.out.print(ut[i][j]);
            }
            

        }
        }
    
     public static void main(String[] args) {
        Fallingsnow2 snowSim = new Fallingsnow2();
        snowSim.sno();
        snowSim.falt();
    }  
        
}