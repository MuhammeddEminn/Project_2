package Task_1;

public class Worker {
    private String name;
    protected double Salary;
    private boolean isOnVacation;

    public Worker(String name, double salary,boolean isOnVacation) {
        this.name=name;
        Salary=salary;
        this.isOnVacation=isOnVacation;

    }

    public double calculateMonthSalary(){
        return Salary;
    }

    public boolean isOnVacation() {
        return isOnVacation;
    }
    public String toString(){
        return "name='"+name+'\''+
                ", money to pay = " + calculateMonthSalary() +
                ", isOnVacation=" + isOnVacation;

    }
}
