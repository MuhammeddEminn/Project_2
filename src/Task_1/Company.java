package Task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
   private String name;
   ArrayList<Worker> list = new ArrayList<>();
   Scanner in = new Scanner(System.in);

    public Company(String name) {
        this.name = name;
    }

    public void addWorker(Worker worker){
        list.add(worker);
    }

    public void showAllWorkers(){
        for(int i=0;i< list.size();i++){
            System.out.println(i+1+"- "+list.get(i).toString());
        }
    }

    public void showWorkersByPosition(){
        System.out.println("1 - QAEngineer \n 2 - FreelanceDeveloper \n 3- ProjectManager \n 4- Developer ");
        in = new Scanner(System.in);

        int a = in.nextInt();

        for (Worker wr: list){
            if (a==1 && wr instanceof QAEngineer){
                System.out.println(wr);
            }else
            if (a==2 && wr instanceof FreelanceDeveloper){
                System.out.println(wr);
            }else
            if (a==3 && wr instanceof ProjectManager){
                System.out.println(wr);
            }else
            if (a==4 && wr instanceof Developer){
                System.out.println(wr);
            }
        }
    }

    public void removeWorker(){
        showAllWorkers();
        System.out.println("Enter the worker number to remove; ");
        int num = in.nextInt();
        list.remove(num-1);
        showAllWorkers();
    }

    public double totalSalaryToPayThisMonth(){
        double total=0.0;
        for (Worker wr : list){
            if(wr.isOnVacation() == false){
                total=total+ wr.calculateMonthSalary();
            }
        }
        return total;
    }
}

