package net.awaken.auth;

import java.io.Serializable;

/**
 * 树形容器
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public interface Tree<ID extends Serializable, T extends Node<ID, T>> extends Container<ID, T> {

}
