package net.awaken.auth.server.entity.resource;

import net.awaken.auth.infrastructure.Suitable;

/**
 * <b>资源容器</b>权限选项
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum ContainerResourceAction implements Suitable {
    /**
     * 可访问
     */
    View(128),
    /**
     * 可配置
     */
    Configure(256);

    private Integer state;

    private ContainerResourceAction(int state) {
        this.state = state;
    }

    @Override
    public boolean match(Integer state) {
        return state != null && (this.state & state) == this.state.intValue();
    }

    @Override
    public Integer state() {
        return state;
    }
}
