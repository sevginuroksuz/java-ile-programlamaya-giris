public class Main {
    public static void main(String[] args) {

        // Arkadas Sayi: Kendileri haric pozitif tam bolenleri toplamı birbirine esit olan sayilardir.
        // En kucuk arkadas sayilar: 220 - 284
        int num1=220, num2=284, num1Total=0, num2Total=0;
        for (int i=1, j=1; i<num1 && j<num2; i++,j++){
            if(num1 % i==0){
                num1Total += i;
            }
            if(num2 % j ==0){
                num2Total += i;
            }
        }
        if(num1==num2Total && num2==num1Total){
            System.out.println("Bu sayilar arkadas sayidir.");
        }else{
            System.out.println("Bu sayilar arkadas sayi degildir.");
        }

    }
}