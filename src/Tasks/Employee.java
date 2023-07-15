package Tasks;

// Q2)


public class Employee {
	public int id;
    public String firstName;
    public String lasttName;
    public String name;
    public double salary;

    public Employee(int id, String firstName, String lastName,double salary) {
        this.id = id;
        this.name = firstName + lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        double raiseAmount = salary * (percent / 100);
        salary += raiseAmount;
    }
    
    
        public static void main(String[] args) {
            Employee emp = new Employee(1, "Ajay", "Anandan",50000.0);
            System.out.println("ID                     : " + emp.id);
            System.out.println("Name                   : " + emp.getName());
            System.out.println("Current annuel salary  : " + emp.getSalary()*12);
            
            emp.raiseSalary(20); // Increase the salary by 20%
            System.out.println("New annuel salary      : " + emp.getSalary()*12);
        }
     
    
}
