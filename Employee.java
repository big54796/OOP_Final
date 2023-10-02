import java.util.ArrayList;

class Employee {
    private String name;
    private String position;
    private int empid;
    private ArrayList<Project> projects;

    public Employee(String name, String position, int empid) {
        this.name = name;
        this.position = position;
        this.empid = empid;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void getEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("EmpID: " + this.empid);
        System.out.println("Projects:");
        for (Project project : this.projects) {
            System.out.println(project.getProjectName() + project.getProjectDescription());
        }
    }
}

class Project {
    private String projectName;
    private String projectDescription;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public String getProjectDescription() {
        return this.projectDescription;
    }
}