package task1;

import java.util.ArrayList;
import java.util.List;

public class Testare {
    public static void main(String[] args) {

        List<Employee> emplo = new ArrayList<>();

        emplo.add(new Manager());
        emplo.add(new Programmer());

        emplo.forEach(emp -> System.out.println(emp.getname() + " - Age: " + emp.getAge() + ", Experience: " + emp.getYearsOfExperience()));

        System.out.println();

        List<Training> emploo = new ArrayList<>();
        emploo.add(new Manager());
        emploo.add(new Programmer());

        emploo.forEach(emp -> emp.canAttendTraining());

        System.out.println();

        List<Interview> emplooo = new ArrayList<>();
        emplooo.add(new Manager());
        emplooo.add(new Programmer());

        emplooo.forEach(emp -> emp.canConductInterview());

        System.out.println();

        // TASK 2
        MeetingRoom meet = new MeetingRoom(emploo);
        meet.startTraining();

        System.out.println();

        // TASK 3
        for (Employee empp : emplo) {
            if (empp instanceof Manager) {
                Manager manager = (Manager) empp;
                manager.canConductInterview();
                manager.canAttendTraining();
            }
            else if (empp instanceof Programmer) {
                Programmer programmer = (Programmer) empp;
                programmer.canConductInterview();
                programmer.canAttendTraining();
            }
        }







//        Manager man = new Manager();
//        Programmer pro = new Programmer();
//
//        System.out.println(man.getname());
//        System.out.println(man.getAge());
//        System.out.println(man.getYearsOfExperience());
//        man.canAttendTraining();
//        man.canConductInterview();
//
//        System.out.println();
//
//        System.out.println(pro.getname());
//        System.out.println(pro.getAge());
//        System.out.println(pro.getYearsOfExperience());
//        pro.canAttendTraining();
//        pro.canConductInterview();
    }
}
