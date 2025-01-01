public class integer_a_romano {

    public static void main(String[] args) {
        String[] romanos = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int[] valores = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

        int num = 48;
        String numeroRomano = "";
        for (int i = romanos.length - 1; i >= 0 && num > 0; i--) {
            while (num >= valores[i]) {
                num -= valores[i];
                numeroRomano = numeroRomano + romanos[i];
            }

        }
        System.out.println(numeroRomano);

    }

}