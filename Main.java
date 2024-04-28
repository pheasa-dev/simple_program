package collectionFramework.practice;

import java.util.ArrayList;

class Worker{
    Integer id;
    String name;
    String gender;
    float wage;
    float hours;
    Worker(){}
    Worker(Integer id, String name, String gender, float wage, float hours) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", wage=" + wage +
                ", hours=" + hours +
                "\n";
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> allWorkes = new ArrayList<>();
        allWorkes.add(new Worker(1001,"jam","male",20,100));
        allWorkes.add(new Worker(1002,"Born","female",26,300));
        System.out.println(allWorkes);
    }
}
