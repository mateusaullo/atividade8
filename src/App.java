import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double ganho;
        double hora;
        double resultado;
    
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Quanto voce ganha por hora: ");
        ganho = teclado.nextDouble();
    
        System.out.print("Quanto voce trabalha por mes:  ");
        hora = teclado.nextDouble();

        teclado.close();
    
        resultado = (ganho * hora) *5;
        System.out.printf("\nVoce ganhou nesse mês R$%.0f reais " ,resultado);
    }
}
