package task1;

public class Manager extends Employee implements Interview, Training {

    public Manager(){
        super("Artur", 48, 15);
    }


//
//    void numeM() {
//        System.out.println(getname());
//    }
//
//    void ageM() {
//        System.out.println(getAge());
//    }
//
//    void yearsM() {
//        System.out.println(getYearsOfExperience());
//    }

    @Override
    public void canAttendTraining() {
        System.out.println(getname() + " yes, can attend training");
    }

    @Override
    public void canConductInterview() {
        System.out.println(getname() + " yes, can conduct an interview");
    }
}
