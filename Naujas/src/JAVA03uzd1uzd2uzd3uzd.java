import java.util.Arrays;

public class JAVA03uzd1uzd2uzd3uzd {
    public static void main(String[] args) {

        /*1. Duoti trys skaičiai: a, b, c. Nustatykite ar šie skaičiai gali būti
        trikampio kraštinių ilgiai ir jei gali tai kokio trikampio:
        lygiakraščio, lygiašonio ar įvairiakraščio. Atspausdinkite
        atsakymą. Kaip pradinius duomenis panaudokite tokius skaičius:
        3, 4, 5
        2, 10, 8
        5, 6, 5
        5, 5, 5*/
        /*2. Apskaičiuokite ir atspausdinkite šių trikampių plotus
         Spausdinimui naudokite: System.out.println("Plotas=" + plotas);*/


        int a = 3;
        int b = 4;
        int c = 5;
        int p = ((a+b+c)/2);
        double roundOff = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        double plotas = Math.round(roundOff*100)/100.00;
        String.format("%.2f", plotas);


        /*3. Duotas masyvas {-10, 0, 2, 9, -5}. Surūšiuokit masyvo
        elementus mažėjimo tvarka ir atspausdinkite.
        ✴ Nenaudokit standartinės masyvo rūšiavimo funkcijos :)*/

        int[] MyArray = {-10, 0, 2, 9, -5};

        System.out.println("Array: " + Arrays.toString(MyArray));

        for(int i=0;i<MyArray.length;i++)
            for(int j=0;j<MyArray.length;j++){
                if(MyArray[j]<MyArray[i]){
                    MyArray[i]=MyArray[i]+MyArray[j];
                    MyArray[j]=MyArray[i]-MyArray[j];
                    MyArray[i]=MyArray[i]-MyArray[j];
                }
            }
        System.out.println("Pakeistas Array: " + Arrays.toString(MyArray));



        if (a < b + c && b < a + c && c < a + b && a==b && b==c && a==c) {
        System.out.println("Gali būti trikampiu" + " lygiakraščiu");
        System.out.println("Plotas=" + plotas);
        } else if (a < b + c && b < a + c && c < a + b && (a==b || a==c || b==c)) {
        System.out.println("Gali būti trikampiu" + " lygiašoniu");
        System.out.println("Plotas=" + plotas);         }
        else if (a < b + c && b < a + c && c < a + b) {
        System.out.println("Gali būti trikampiu" + " įvairiakraščiu");
        System.out.println("Plotas=" + plotas);
        } else {
        System.out.println(" Negali būti trikampiu");

        }
    }
}