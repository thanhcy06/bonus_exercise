public class baitap01 {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Thanh Ky", "Nguyen", 1700);

        System.out.println("id:"+e1.getId()+"\t"+"lastname:"+e1.getLastname()+"\t"+"firstname:"+e1.getFirstname()+"\t"+"salary:"+e1.getSalary());
        e1.setSalary(999);

        System.out.println(e1);
        System.out.println("id is:"+e1.getId());
        System.out.println("lastname is:"+e1.getLastname());
        System.out.println("firstname is:"+e1.getFirstname());
        System.out.println("salary is:"+e1.getSalary());
        System.out.println("name is:"+e1.getName());
        System.out.println("Annual Salary is:"+e1.getAnnualSalary());
        System.out.println(e1.getRaiseSalary(10));
        System.out.println(e1);


    }
}
