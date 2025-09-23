public class employee {
    String name;
    int empid;
    double empsalary;

    public employee(String name,int empid,double empsalary)
    {
        this.name=name;
        this.empid=empid;
        this.empsalary=empsalary;

    }

    public void details()
    {
        System.out.println("name of the employee is "+ name+"with id"+empid);
    }
}

class manager extends employee {
    int member;

    public manager(String name, int empid, double empsalary, int member) {
        super(name, empid, empsalary);
        this.member = member;
    }

    @Override
    public void details() {
        super.details();
        System.out.println(member);
    }
}
class developer extends employee {
    String lang;

    public developer(String name, int empid, double empsalary, String lang) {
        super(name, empid, empsalary);
        this.lang = lang;
    }

    @Override
    public void details() {
        super.details();
        System.out.println(lang);
        
    }
}


class intern extends employee {
    String college;

    public intern(String name, int empid, double empsalary, String college) {
        super(name, empid, empsalary);
        this.college = college;
    }

    @Override
    public void details() {
        super.details();
        
        System.out.println("College: " + college);
    
    }
}
public class employee{
    public static void main(String[] args) {
        manager obj1 = new manager("Ravi", 1, 50000, 5);
        developer obj2 = new developer("Meena", 2, 40000, "Python");
        intern obj3 = new intern("Ali", 3, 10000, "ABC College");

        obj1.details();
        obj2.details();
        obj3.details();
    }
}
