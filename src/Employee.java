

public class Employee extends Person {
    Integer salary;
    
    Employee(String firstName, String lastName, Byte age, Integer ssn, Integer salary) {
        super(firstName, lastName, age, ssn);
    }
    public String speak(Employee person){
        return "Hi, my name is " + person.getFirstName() + "and my salary is " + person.getSalary();
    }
    public Integer getSalary() {
        return salary;
    }
}
