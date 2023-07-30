import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
        /*
        System.out.println("Eleman sayısı : " + mesaj.length());    // .length(): mesajın kaç karakterden oluştuğunu döndürür.
        System.out.println("5. eleman : " + mesaj.charAt(4));      // .charAt(): mesaj stringinin girilen indisindeki karakteri dödürür.
        System.out.println(mesaj.concat(" Yaşasın!"));      // .concat(): mesaj stringiyle verilen stringi birleştirir.
        System.out.println(mesaj.startsWith("B"));       // .startsWith(): String ifade, içerisindeki karakterle başlıyorsa true; başlamıyorsa false döndürür
        System.out.println(mesaj.endsWith("."));       // .endsWith(): String ifade, içerisindeki karakterle bitiyorsa true; bitmiyorsa false döndürür

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));         // .indexOf(): İçindeki karakterin mesaj stringinin baştan kaçıncı indisinde olduğunu döndürür.
        System.out.println(mesaj.lastIndexOf("e"));     // .lastIndexOf(): İçindeki karakterin mesaj stringinin sondan kaçıncı indisinde olduğunu döndürür.

         */

        // replace(): Metindeki seçilen karakterleri değiştirmeye yarar. Metnin kendisini değiştirmez. Yeni güncellenmiş bir metin oluşturur.
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);

        // substring(): Bir metnin içinden parça almayı sağlar.
        System.out.println(mesaj.substring(5));
        System.out.println(mesaj.substring(2,5));

        // split(): Bir metni belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar.
        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        // toLowerCase(): Tüm harfleri küçük harfe çevirir.
        // toUpperCase(): Tüm harfleri büyük harfe çevirir.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        // trim(): String ifadelerin başında ve sonundaki boşlukları atmayı sağlar.
        System.out.println(mesaj.trim());



    }
}