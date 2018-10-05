import java.util.Scanner;

class emp{
    String Name;
    String id;
}
class teacher extends emp{
    String subject;
    void input(){
        Scanner re = new Scanner(System.in);
        System.out.println("Enter Teacher Details");
        Name = re.nextLine();
        id = re.nextLine();
        subject = re.nextLine();
    }
    void disp(){
        System.out.println(Name + " " + id + " " + " " + subject);
    }
}
class staff extends emp{
    String dept;
    void input(){
        Scanner re = new Scanner(System.in);
        System.out.println("Staff Teacher Details");
        Name = re.nextLine();
        id = re.nextLine();
        dept = re.nextLine();
    }
    void disp(){
        System.out.println(Name + " " + id + " " + " " + dept);
    }
}
class man{
    public static void main(String[] args) {
        teacher t = new teacher();
        t.input();
        t.disp();

        staff s = new staff();
        s.input();
        s.disp();
    }
}

