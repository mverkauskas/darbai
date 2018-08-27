public class JAVA04uzd1uzd2 {
    public static void main(String[] args) {

        /*1. Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8,
        5, 3}. Raskite kiekvieno masyvo skaičių vidurkį ir
        atspausdinkite jų skirtumą. Rezultatas turi gautis:
        2.66666…*/

         int suma = 0;
         int suma2 = 0;
         int[] a = {5, 6, 10, 15, 8, 4};
         int[] b = {8, 5, 3};
         for(int i = 0; i < a.length; i++) {
         suma += a[i];     }
         System.out.println("a masyvo vidurkis: " + (suma / a.length));
         for(int i = 0; i < b.length; i++) {       suma2 += b[i];     }
         System.out.println("b masyvo vidurkis: " + (1.0 * suma2 / b.length));
         System.out.println("a ir b masyvu skirtumas: " + ((suma / a.length) - (1.0 * suma2 / b.length)));

        /*2. Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus
        visų savo daliklių, mažesnių už save patį, sumai.
                pvz 28 = 1 + 2 + 4 + 7 + 14
        Suraskite visus tokius skaičius iš intervalo 1…1000.*/

         int mazas = 1;     int didelis = 1000;
         for (mazas = 1; mazas <= didelis; mazas++) {
         int stebuklingasSkaicius = 0;
         for (int s = 1; s < mazas; s++) {
         if ((mazas % s) == 0) {           stebuklingasSkaicius += s;         }       }
         if (stebuklingasSkaicius == mazas) {
             System.out.println("Tobulas skaicius yra: " + stebuklingasSkaicius);
         }
         }
    }
}