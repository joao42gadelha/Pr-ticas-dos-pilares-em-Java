public class ex006 {
    public static void main(String[] args) {
        System.out.println("Preço de um produto com desconto de 10% \n");

        double precoOriginal = 253.52;
        double percentualDesconto = precoOriginal - ( 10 * precoOriginal) / 100;

        System.out.println("O valor com desconto é de: " + percentualDesconto);
    }
}
