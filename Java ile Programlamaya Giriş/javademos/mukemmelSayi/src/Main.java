public class Main {
    public static void main(String[] args) {
        // Kendisi haric tum bolenleri toplandiginda toplam kendisine esit oluyorsa bu sayi mukemmel sayidir.
        // 6 --> 1,2,3
        // 28--> 1,2,4,7,14

        int number =28;
        int total = 0;
        for(int i=1; i<number; i++)
        {
            if(number % i==0){
                total += i;

            }
        }

        if (total==number)
            System.out.println("Bu sayi mukemmel sayidir.");
        else
            System.out.println("Bu sayi mukemmel sayi degildir.");



    }
}