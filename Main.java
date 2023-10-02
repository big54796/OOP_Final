public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", "UX/UI", 0001);
        employee1.addProject(new Project("Web A", "Developing a web application"));
        employee1.addProject(new Project("Mobile app A", "Developing a mobile app"));

        Employee employee2 = new Employee("Tim", "FrontEnd", 0002);
        employee2.addProject(new Project("Web A", "Developing a web application"));

        employee1.getEmployeeDetails();
        employee2.getEmployeeDetails();
    }
}