public class Student {
    String Name;
    String Dept;
    int Age;
    public static void main(String []args){
     
    Student S1 = new Student ();
    S1.Name = "BJ";
    S1.Dept = "CSE";
    S1.Age = 20;

    Student S2 = new Student ();
     S2.Name = "Surya";
     S2.Dept = "IT";
     S2.Age = 22;

     System.out.println("Student 1 Name:"+ S1.Name);
     System.out.println("Student 1 Dept:"+ S1.Dept);
     System.out.println("Student 1 Age:"+ S1.Age);
     System.out.println("Student 2 Name:"+ S2.Name);
     System.out.println("Student 2 Name:"+ S2.Dept);
     System.out.println("Student 2 Age:"+ S2.Age);
    }
}