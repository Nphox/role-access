import java.util.HashSet;
import java.util.Set;

public class Permission {
    private int id;
    private String name;
    private BusinessObject businessObject;
    private Set<Action> actions = new HashSet<Action>();

    public Permission(int id, String name, BusinessObject businessObject) {
        this.id = id;
        this.name = name;
        this.businessObject = businessObject;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public BusinessObject getBusinessObject() {
        return businessObject;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public void addAction(Action action) {
        actions.add(action);
    }
}
