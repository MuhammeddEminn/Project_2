package Task_1;

public class FreelanceDeveloper extends Developer{
    private int workedHours;

    public FreelanceDeveloper(String name, double salary, boolean isOnVacation, Level level,int workedHours) {
        super(name, salary, isOnVacation, level);
        this.workedHours = workedHours;
    }

    public  double calculateMonthSalary(){
        if (workedHours>=200){
            return super.calculateMonthSalary()+1000;
        }else
            return super.calculateMonthSalary();
    }
    public String toString(){
        return super.toString()+
                " worked for " + workedHours+ " Hours";
    }
}
