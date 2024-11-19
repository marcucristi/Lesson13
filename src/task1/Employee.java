package task1;

public class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;

    public Employee(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }


    String getname() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getYearsOfExperience() {
        return yearsOfExperience;
    }

    void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
