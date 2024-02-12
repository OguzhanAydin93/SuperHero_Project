
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();

////////////////////////////////////////////////////////////////////////////////////
        // TODO: Tüm Süper Kahramanları allHeros listesine ekleyin.


        allHeroes.add("batman");
        allHeroes.add("superman");
        allHeroes.add("wonder Woman");
        allHeroes.add("spiderman");
        allHeroes.add("wolverine");


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullanıcıya mevcut tüm süper kahramanları göstererek, asagidaki menuyu olusturun
        //      "Süper Kahramanlar gösterisine hoş geldiniz..."
        //      "Mevcut Süper Kahramanlar: " + allHeroes
        //       "Çıkmak için q'ya basın..."


        System.out.println("Süper Kahramanlar gösterisine hoş geldiniz...");
        System.out.println("Süper Kahramanlar Listesi = " + allHeroes);
        System.out.println("Çıkmak için q'ya basın...");
        String secim;


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullaniciya "Hangi süper kahramanı eklemek istiyorsunuz? " sorusunu sorarak tercihini alin

        Scanner oku = new Scanner(System.in);

        while (true) {

            System.out.print("Hangi süper kahramanı eklemek istiyorsunuz = ");
            secim = oku.nextLine().toLowerCase();

            if (secim.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }
            if (allHeroes.contains(secim) && !activeHeroes.contains(secim)) {
                System.out.println(secim + " oyuna başarıyla eklendi.");
            } else if (activeHeroes.contains(secim)) {
                System.out.println(secim + " zaten oyunda aktif!");
                break;
            } else if (!allHeroes.contains(secim) && !activeHeroes.contains(secim)) {
                System.out.println("Lütfen geçerli bir süper kahraman girin");
            }

            HeroFactory factory = new HeroFactory();
            SuperHeroes superHero = factory.produceSuperHero(secim);


            if (superHero != null) {
                superHero.attack();
                superHero.printInfo();
                superHero.exposeSecretPower();
                activeHeroes.add(secim);

                boolean found = false;
                for (int i = 0; i < allHeroes.size(); i++) {
                    if (allHeroes.get(i).equalsIgnoreCase(secim)) {
                        found = true;
                        allHeroes.remove(i);
                        break;
                    }
                }
                System.out.println("Aktif kahramanlar:" + activeHeroes);
                allHeroes.remove(secim);
                System.out.println("Aktif Olmayan Kahramanlar = " + getRemainingHeroes(allHeroes, activeHeroes));
            }


            //TODO: Eğer girilen isim allHeros listesinde var da, activeHeroes listesinde yoksa : "... oyuna başarıyla eklendi." yazın;
            // oyunda aktif olan ve oyuna girmemiş tüm kahramanları yazdırın...

            //TODO: Eğer girilen isim activeHeroes listesinde varsa "... zaten oyunda aktif!" yazın;

            //TODO: Eğer girilen isim allHeros listesinde de activeHeroes listesinde de yoksa : "... Lütfen geçerli bir süper kahraman girin..." yazın;

            //NOT: getRemainingHeroes(){} metodunu oyuna girmemiş kahramanlar için kullanabilirsiniz...}


        }
    }

    // TODO Bu methodda bir degisiklik yapmayiniz
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}

