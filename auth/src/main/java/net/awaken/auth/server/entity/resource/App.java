package net.awaken.auth.server.entity.resource;

import net.awaken.auth.server.entity.Resource;

import java.util.Set;

/**
 * 应用
 * <p>
 * 将<b>权限管理与维护功能</b>单独设为一个{@link App}。<br>
 * 这时对该{@link App}资源的访问权限、以及操作权限，就意味着登录用户被授予了管理员角色权限、能配置其他用户的各种资源权限管控。<br>
 * 在<b>权限管理与维护{@link App}</b>上展示：所有可配置资源的树状结构，登录用户可自行在自己权限范围内配置
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 02.01.2019
 */
public class App extends Resource {

    private Module module;

    private Set<Document> documents;

    private Set<Menu> menus;

    private Set<Service> services;

    private Set<Table> tables;

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Set<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Set<Table> getTables() {
        return tables;
    }

    public void setTables(Set<Table> tables) {
        this.tables = tables;
    }

}
