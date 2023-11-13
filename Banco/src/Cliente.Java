import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;
public class Cliente{
    //Clientes teram atributos "Nome, cpf, email"

    @Getter @Setter protected String nome;
    @Getter @Setter protected String cpf;
    @Getter @Setter protected String email;
    @Getter @Setter protected String conta;
 
         
     public void abrirConta(){
        
        System.out.println("Deseja Abrir uma nova conta? se sim qual. Conta poupança(CP) ou Conta Corrente (CC)");
        Scanner ct = new Scanner(System.in);
        conta = ct.nextLine();
        if(conta == "CP"){
          System.out.println("Voce abriu uma conta poupança");
        }else if("CC".equals(conta)){
          System.out.println("Voce abriu uma conta corrente");
        }else if()
     } 
}