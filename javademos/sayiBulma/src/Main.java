public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[]{1,2,5,7,9,0};
        int callNum =6;
        boolean isThere = false;

        for(int num: numbers){
            if(num==callNum){
                isThere = true;
                break;
            }
        }
        if(isThere){
            System.out.println("Aranan sayi bulundu!");
        }else{
            System.out.println("Aranan sayi bulunamadi!");
        }
    }
}