package Task_1;

public class QAEngineer extends Worker{
        private int projectsAmount;

    public QAEngineer(String name, double salary, boolean isOnVacation, int projectsAmount) {
        super(name, salary, isOnVacation);
        this.projectsAmount=projectsAmount;
    }
    public double doublecalculateMonthSalary(){
        if (projectsAmount>1){
            return Salary+(projectsAmount-1)*200;
        }else {
            return Salary;
        }
    }
    public String toString(){
        return super.toString()+
                " projects Amount= "+projectsAmount;
    }
}
