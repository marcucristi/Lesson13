package task1;

public class Programmer extends Employee implements Interview, Training {

    public Programmer() {
        super("Mircea", 24, 2);
    }


//    void numeP() {
//        System.out.println(Programmer.getname());
//    }
//
//    void ageP() {
//        System.out.println(Programmer.getAge());
//    }
//
//    void yearsP() {
//        System.out.println(Programmer.getYearsOfExperience());
//    }


    @Override
    public void canAttendTraining() {
        System.out.println(getname() + " can attend training, but not in a confident way");
    }

    @Override
    public void canConductInterview() {
        System.out.println(getname() + " definetly not");
    }
}
