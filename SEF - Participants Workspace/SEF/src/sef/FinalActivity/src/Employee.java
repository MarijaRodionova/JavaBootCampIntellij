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

    public Employee(){
        name =  "Alfred";
        age = 6;
        jobTitle = "CEO";
        company = "Google";

    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("My name is " + emp.name);
        System.out.println("My age is " + emp.age);
        System.out.println("My job title is " + emp.jobTitle);
        System.out.println("My company is " + emp.company);




    }





}
