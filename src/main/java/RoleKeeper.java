import java.util.HashSet;
import java.util.Set;

public class RoleKeeper {
    private Set<Role> roles = new HashSet<Role>();

    public void addRole(Role role){
        roles.add(role);
    }

    public void removeRole(Role role){
        roles.remove(role);
    }
}
