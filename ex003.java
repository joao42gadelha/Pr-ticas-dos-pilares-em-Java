public class ex003 {
    public static void main(String[] args) {
        System.out.println("Transformação de double para variável int: ");

        double numero = 52.3;
        int numeroInteiro = 25;

        int doubleForInt = (int) numero;
        double intForDouble = (double) numeroInteiro;

        System.out.println("De double para Int: \n" + doubleForInt);
        System.out.println("De int para double: \n" + intForDouble);

    }

}
