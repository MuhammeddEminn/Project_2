package Task_1;

import Task_1.Worker;

public class ProjectManager extends Worker {
    private int yearsOfExperience;

    public ProjectManager(String name, double salary, boolean isOnVacation,int yearsOfExperience) {
        super(name, salary, isOnVacation);
        this.yearsOfExperience=yearsOfExperience;
    }

    public double calculateMonthSalary(){
        return Salary+yearsOfExperience*100;
    }

    public String toString(){
        return super.toString() +
                " has " + yearsOfExperience + " years of experience";
    }
}
