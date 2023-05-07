package homework17;

public class Students {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.*/
String name;
char mathGrade;
char scienceGrade;
char literatureGrade;
Students(String name,char mathGrade,char scienceGrade,char literatureGrade){
    this.name=name;
    this.mathGrade=mathGrade;
    this.scienceGrade=scienceGrade;
    this.literatureGrade=literatureGrade;

}
void printInfo(){
    System.out.println(name+" "+mathGrade+" "+scienceGrade+" "+literatureGrade);
}

    public static void main(String[] args) {
        Students st1=new Students("William",'A','D','B');
        st1.printInfo();
        Students st2=new Students("Franco",'D','A','C');
        st2.printInfo();
        Students st3=new Students("Vivian",'C','A','B');
        st3.printInfo();
    }
}
