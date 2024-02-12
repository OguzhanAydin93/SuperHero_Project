
public class WonderWoman extends SuperHeroes {

    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super(name,gender,aggression,wisdom,beauty);
        setLassoOfTruthAbility("Doğruluk Kementi");

    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;


// TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wonder Woman'ın Özelliği = " + lassoOfTruthAbility);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca " + getName()+" ın Kılıcı Vardır Ve Kılıcı İle Saldırır. ");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println("Bilekliklerini Birbirine Vurunca Sismik Dalga Yaratır.");
    }

    @Override
    public String toString() {
        return "Wonder Woman{" +
                "lassoOfTruthAbility='" + lassoOfTruthAbility + '\'' +
                '}';
    }
}
