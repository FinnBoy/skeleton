package net.awaken.domain;

/**
 * Closure Table.
 * <p>
 * Ancestor 代表祖先节点
 * Descendant 代表后代节点
 * Distance 祖先距离后代的距离
 * </p>
 * <p>
 * 只有直系的祖先后代关系，才会有数据表示祖先距离后代的距离
 * 比如：
 * Food 下面有 Meat 和 Fruit，
 * Meat 下面有 Beef 和 Pork，
 * Fruit 下面有 Cherry 和 Banana，
 * 那么（ Beef 和 Pork ） 与 Fruit 之间是没有关系的，不会也不能有数据录入，去表示他们之间的距离关系
 * 同理（ Cherry 和 Banana ） 与 Meat 之间也是没有关系的。
 * </p>
 * <p>
 * 同级别的相邻节点，不会有数据录入
 * </p>
 */
public interface Closure {

    void setAncestor(Long ancestor);

    Long getAncestor();

    void setDescendant(Long descendant);

    Long getDescendant();

    void setDistance(Integer distance);

    Integer getDistance();

}
