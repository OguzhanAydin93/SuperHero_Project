
public class Wolverine extends SuperHeroes {

    private String adamantiumClaws;
    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty) {
        super(name,gender,aggression,wisdom,beauty);
        setAdamantiumClaws("Adamantium Pençeleri");
    }

    public String getAdamantiumClaws() {
        return adamantiumClaws;
    }

    public void setAdamantiumClaws(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty, String adamantiumClaws) {
        super(name, gender, aggression, wisdom, beauty);
        this.adamantiumClaws = adamantiumClaws;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wolverine'in Özelliği = " + adamantiumClaws);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca " +getName() + " Adamantium Pençelere Ve Kurşun İşlemez Bir Deriye Sahiptir.");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println("Wolverin'in Sağlık Yenileme Özelliği Vardır.");
    }

    @Override
    public String toString() {
        return "Wolverine{" +
                "adamantiumClaws='" + adamantiumClaws + '\'' +
                '}';
    }

    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    }

