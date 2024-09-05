public class MotherClass {

    private int hp;
    protected String name;
    private final boolean ISMALE;

    public MotherClass(String name,int hp,boolean isMale) {
        this.hp = hp;
        this.name = name;
        this.ISMALE = isMale;
    }

    public int getHP(){
        return hp;
    }

    public void setHP(int newHP){
        hp = newHP;
    }

    public void introduceSelf(){
        System.err.println("My name is "+name+" Male? "+ISMALE);
    }

    public void introduceSelf(String job){
        System.err.println("My name is "+name+" Male? "+ISMALE+" My job is "+job);
    }

    
}
