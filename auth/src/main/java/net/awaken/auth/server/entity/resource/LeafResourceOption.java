package net.awaken.auth.server.entity.resource;

import net.awaken.auth.infrastructure.Suitable;

/**
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public enum LeafResourceOption implements Suitable {
    /**
     * Client App Component.
     * eg.:
     * Page, Button.
     */
    Component(10),
    /**
     * Server Service.
     * ps:
     * Document Upload & Download can be also as a kind of service.
     * login as well.
     */
    Service(20),
    /**
     * DB Data(or just data?).
     * <p>
     * 只要控制权限的表的columns数据，不溢出到其他表上，那么控制起来就很方便。
     * 只要在 sql 上搜索 控制权限的表，在此表上加上 权限控制的条件，并作为 sub query 替换掉该表就可以了。
     * 因为一般权限控制表的 columns 数据设置对 subject 来说数据量不会太多，那么在这些 columns 上加上 index，查询速度也会快很多。
     * 比如：
     * customer 表，其他表都是建外键 column 指向 customer 的 ID。
     * 访问 customer 信息是通过本表上的 customer_ID 外键去关联 customer 表，获取 customer 信息；
     * 而不是在其他表上重复建 customer 的 code、name 这些column（这样增加冗余column虽然提高了性能，但是数据不方便控制），
     * 并且不去关联 customer 表。
     * </p>
     */
    Domain(30);

    private Integer state;

    private LeafResourceOption(Integer state) {
        this.state = state;
    }

    @Override
    public boolean match(Integer state) {
        return state != null && this.state.intValue() == state.intValue();
    }

    @Override
    public Integer state() {
        return state;
    }
}
