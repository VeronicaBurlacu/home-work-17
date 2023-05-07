package homework17;

public class task2Jobs {
    //write a Java class that have 4 constructers withh 4 diff access levels of constr(private public,default,protected)
    //and create 4 obj of this class:1-inside same class 2-nd from outside the class;3-from diff class inside diff package and observe the result
    String name;
    String workers;
    int salary;
    task2Jobs(String name,String workers,int salary){
        this.name=name;
        this.salary=salary;
        this.workers=workers;

    }
    //private  void task2Jobs(String name,String workers,int salary){
        /*this.name=name;
        this.workers=workers;
        this.salary=salary;
    }
    static void task2Jobs(String name,String workers,int salary){//not allowed in Java
        this.name=name;
        this.workers=workers;
        this.salary=salary;*/
    }
//}
