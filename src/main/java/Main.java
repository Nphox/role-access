public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alex", "Fisher");
        Employee emp2 = new Employee(2, "Bob", "Sanders");

        Action observe = new Action("Observe");
        Action add = new Action("Add");
        Action remove = new Action("Remove");
        Action change = new Action("Change");

        BusinessObject Alpha = new BusinessObject("Alpha");
        BusinessObject Beta = new BusinessObject("Beta");
        BusinessObject Gamma = new BusinessObject("Gamma");

        Permission observeVehiclesOnMaintenancePermission = new Permission(1, "Observe vehicles on maintenence", Alpha);
        observeVehiclesOnMaintenancePermission.addAction(observe);
        observeVehiclesOnMaintenancePermission.addAction(add);

        Role maintenanceManager = new Role("Maintenance Manager");
        maintenanceManager.addPermission(observeVehiclesOnMaintenancePermission);
        maintenanceManager.addEmployee(emp1);

        if(maintenanceManager.containsEmployee(emp1)){
            System.out.println(Alpha.getName());
        }
    }
}
