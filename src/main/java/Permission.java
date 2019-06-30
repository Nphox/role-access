public class Permission {
    private String name;
    private BusinessObject businessObject;
    private Action action;

    public Permission(String name, BusinessObject businessObject, Action action) {
        this.name = name;
        this.businessObject = businessObject;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public BusinessObject getBusinessObject() {
        return businessObject;
    }

    public Action getAction() {
        return action;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessObject(BusinessObject businessObject) {
        this.businessObject = businessObject;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
