import java.util.Scanner;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;


    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
     //   this.raiseSalary= raiseSalary;


    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public int getSalary() {
        return this.salary;
    }
    public int getAnnualSalary() {
        return this.salary * 12;
    }
      public void setId(int id) {
        this.id = id;
      }
      public void setFirstname(String firstname) {
        this.firstname = firstname;
      }
      public void setLastname(String lastname) {
        this.lastname = lastname;
      }
      public void setSalary(int salary) {
        this.salary = salary;
      }



        //Scanner sc = new Scanner(System.in);
       //  int percent = sc.nextInt();
    public int getRaiseSalary (int e) {
          return this.salary = this.salary / e + this.salary;
    }
    //public int getTotalSalary() {
      //  return getRaiseSalary() = this.salary   ;
    //}
    public String toString() {
        return "Employee [id=" + this.id + ", firstname=" + this.firstname + ", lastname=" + this.lastname + ", salary=" + this.salary + "]";
    }
}