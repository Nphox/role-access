import java.util.HashSet;

import java.util.Set;

public class Role {
    private String name;
    private Set<Permission> permissions = new HashSet<Permission>();
    private Set<Employee> employees = new HashSet<Employee>();

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPermission(Permission permission){
        permissions.add(permission);
    }

    public void removePermission(Permission permission){
        permissions.remove(permission);
    }

    public boolean conteinsPermission(Permission permission){
        return permissions.contains(permission);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public boolean containsEmployee(Employee employee){
        return employees.contains(employee);
    }
}
