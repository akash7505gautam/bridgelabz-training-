public class Hospital {
    static class Patient{
        static String hospname="nidhi hospital";
        static int totpatient;
        String name;
        int age;
        final int patientid=20;

        Patient(String name,int age)
        {
            this.name=name;
            this.age=age;
            totpatient++;

        }
        void totalpatient()
        {
            System.out.println(totpatient);
        }
    }
    public static void main(String args[]){
        Patient p=new Patient("hemant", 65)
        p.totalpatient();
        if(p instanceof Patient){
            System.out.println("yes its object of thgis class ");
        }
        else{
            System.out.println("not a object");
        }
    }
    
}
