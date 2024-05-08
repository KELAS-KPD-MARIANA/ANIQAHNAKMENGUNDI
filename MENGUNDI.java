
           
package mengundi;
import java.util.Scanner;
public class MENGUNDI {
  
    
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        int umur;
        boolean status;
        
        System.out.println("Masukkan umur anda :");
        umur = input.nextInt();
        
         System.out.println("Anda berdaftar?(true/false) :");
         status = input.nextBoolean();
         
        if (umur >=18 && status==true){
            System.out.println("Anda layak untuk mengundi");
        }else if (status==false){
              System.out.println("Anda perlu berdaftar sebelum mengundi");
                    
        
       
        }else {
             System.out.println("Anda terlalu muda untuk mengundi");
        }

    }
    
}

   
