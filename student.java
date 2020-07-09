class student
{
//int id;
//String name;

 student(int id,String name)
 {
     int id;
     String name;
 }

    void display()
    {
        System.out.println("the id is"+id);
        System.out.println("the name is"+name);
    }
    public static void main(String args[])
    {
        student s1 = new student(11,"miqdam");
        s1.display();
    }
  }
