public class Main {
    public static void main(String[] args) {

        int remainder, number, asalMi;
         number=1;
         asalMi=0;

        for(int i=2; i<number; i++){

            remainder = number % i;

            if(remainder==1){
                asalMi++;

            }
        }
        if(asalMi>0 && number>1){
            System.out.println(number+" asal");
        }
        else{
            System.out.println(number+" sayısı asal değil");
        }

    }
}