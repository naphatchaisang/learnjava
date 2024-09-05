public class ChildClass extends MotherClass {

    private boolean isBirthAtHospital;


    public ChildClass(String name, int hp, boolean isMale,boolean isBirthAtHospital) {
        super(name, hp, isMale);
        this.isBirthAtHospital = isBirthAtHospital;
    }

    public void introduceSelf(){
        System.err.println("blah blah "+super.name);
    }




}
