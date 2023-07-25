public class Main {
    public static void main(String[] args) {

        findNum();
    }

    public static void findNum(){

        int [] numbers = new int[]{1,2,5,7,9,0};
        int callNum =6;
        boolean isThere = false;

        for(int num: numbers){
            if(num==callNum){
                isThere = true;
                break;
            }
        }
        String message="";
        if(isThere){
            message ="Aranan sayi bulundu!";
            giveMessage(message);
        }else{
            message = "Aranan sayi  bulunamadi!!";
            giveMessage(message);
        }
    }

    public static void giveMessage(String message){
        System.out.println(message);
    }
}
