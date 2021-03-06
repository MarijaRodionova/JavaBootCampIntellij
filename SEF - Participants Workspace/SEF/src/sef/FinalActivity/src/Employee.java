public class Employee {

    String name;
    int age;
    String jobTitle;
    String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee(String name,  int age, String jobTitle, String company){
        this.name =  name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;

    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alfredo", 11, "CEO", "Google");

        System.out.println("My name is " + emp.name + " and i am " + emp.age + " years old. I work as a " + emp.jobTitle + " in a company " + emp.company + ".");
    }





}
