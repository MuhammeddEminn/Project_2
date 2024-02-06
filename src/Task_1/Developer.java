package Task_1;

public class Developer extends Worker{
    private Level level;

    public double calculateMonthSalary(){
        if (Level.JUNIOR == level){
            return Salary;
        }else if (Level.MIDDLE == level){
            return Salary+Salary*0.1;
        }else
            return Salary+Salary*0.2;
    }

    public Developer(String name, double salary, boolean isOnVacation, Level level) {
        super(name, salary, isOnVacation);
        this.level=level;
    }

    public String toString() {
        return super.toString() +
                " developer level = " + level;
    }

}
