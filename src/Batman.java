
public class Batman extends SuperHeroes {

    private String detectiveSkillsAbility;


    public Batman(String name, String gender, String aggression, String wisdom, String beauty, String detectiveSkillsAbility) {
        super(name,gender,aggression,wisdom,beauty);
        setDetectiveSkillsAbility("Dedektif Görüşü");
    }

    public String getDetectiveSkillsAbility() {
        return detectiveSkillsAbility;
    }

    public void setDetectiveSkillsAbility(String detectiveSkillsAbility) {
        this.detectiveSkillsAbility = detectiveSkillsAbility;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica " + getName() + " dedektif becerileri ile saldirabilir ve dusmanlarini planlayarak alt edebilir");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Batman'in Ozelliği = " + detectiveSkillsAbility);

    }


    @Override
    public void exposeSecretPower() {
        System.out.println(getName() + " dedektif becerilerine sahiptir ve bu yetenegiyle suclulari yakalamda ustalasmistir");
        System.out.println();
        System.out.println("Ayrıca batman'in özel gücü zengin olmasıdır. :)  ");
    }

    @Override
    public String toString() {
        return "Batman{" +
                "detectiveSkillsAbility='" + detectiveSkillsAbility + '\'' +
                '}';
    }
}