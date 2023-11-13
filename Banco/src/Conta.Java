import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
public class Conta extends Cliente{
     @Getter @ Setter protected double dinheiro;

     
     public void saque()
     System.out.println("Qual seria o valor do saque");
     Scanner x = new Scanner(System.in);
     valor = x.nextDouble();
     setDinheiro(getDinheiro() - valor);
     if(valor > getDinheiro){
          System.out.println("Dinheiro insfuciente");
     }else{
          continue;
     }
    
     public void visualizarDebito{
     System.out.println(getDinheiro);
    }
   
}