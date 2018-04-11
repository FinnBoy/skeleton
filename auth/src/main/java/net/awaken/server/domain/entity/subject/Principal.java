package net.awaken.server.domain.entity.subject;

import net.awaken.server.domain.entity.permission.Privilege;
import net.awaken.server.domain.entity.resource.Module;

import java.util.Set;

/**
 * 当事人
 */
public interface Principal extends Subject {

    /**
     * get department.
     *
     * @return department
     */
    Department getDepartment();

    /**
     * get adjunctDepts
     *
     * @return adjunctDepts
     */
    Set<Department> getAdjunctDepts();

    /**
     * get groups
     *
     * @return groups
     */
    Set<Group> getGroups();

    /**
     * get related module's privilege.
     *
     * @param module
     * @return privilege
     */
    Privilege getPrivilege(Module module);

    /**
     * 属于该部门的人员
     *
     * @param department
     * @return true if is this department's man.
     */
    boolean belongTo(Department department);
}
