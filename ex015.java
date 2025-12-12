import java.util.Scanner;
public class ex015 {
    public static void main (String[] args){
        Scanner leitura = new Scanner (System.in);
        double preco;
        System.out.println("Informe o preço do produto: ");
        preco = leitura.nextDouble();

        if (preco >= 100.00){
            double desconto = preco * 0.10;
            double precoFinal = preco - desconto;
            System.out.println("Valor de desconto aplicado na compra de: " + preco);
            System.out.println("Valor com desconto: " + precoFinal);
        }else{
            System.out.println("Desconto apenas em compras acima de 100 reais. ");
            System.out.println("Valor da compra: " + preco);
        }
    }

}
