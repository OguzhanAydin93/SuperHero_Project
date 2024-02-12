

public class Superman extends SuperHeroes {

    private String flyingAbility;

    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super(name,gender,aggression,wisdom,beauty);
        setFlyingAbility("Uçma Özelliği");
    }

    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Süperman'in Özelliği " + flyingAbility);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca" + getName()+" Uçarken Supersonic Flight-Güçlü Saldırılar ve Lazer Işını Saldırıları Gerçekleştirebilir");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println("Superman Supersonic Flight Hızında Uçma Yeteneğine Sahiptir ");
    }

    @Override
    public String toString() {
        return "Superman{" +
                "flyingAbility='" + flyingAbility + '\'' +
                '}';
    }

    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...


}
