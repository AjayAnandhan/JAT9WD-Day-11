package Tasks;

// Q1)


public class Person {

	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	


	        public static void main(String[] args) {
	            Person person = new Person("Ajay", 23);
	            String name = person.getName();
	            int age = person.getAge();
	            System.out.println("Name : " + name);
	            System.out.println("Age  : " + age);
	        }
	    
}
