public class Main {
    public static void main(String[] args) {

        char harf='e';
        switch (harf){
            case'A':
            case'O':
            case'I':
            case'U':
            case'a':
            case'ı':
            case'o':
            case'u':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");

        }

    }
}