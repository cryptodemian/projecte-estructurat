public class Main {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 2; i <= 100; i++) {  // Comencem des de 2, ja que 1 no és primer
            if (esPrimer(i)) {
                suma += i;
            }
        }
        System.out.println("La suma dels nombres primers de l'1 al 100 és: " + suma);
    }

    private static boolean esPrimer(int n) {
        if (n <= 1) {
            return false;
        }
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
