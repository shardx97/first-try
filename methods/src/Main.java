public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int [] {1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMı = false;

        for (int sayi : sayilar){
            if (sayi == aranacak) {
                varMı = true;
                break;
            }
        }
        String mesaj="";
        if(varMı) {
            mesaj ="Sayı mevcuttur :" +aranacak
            mesajVer();
        }else {
            mesajVer("Sayı mevcut değildir: "+aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}