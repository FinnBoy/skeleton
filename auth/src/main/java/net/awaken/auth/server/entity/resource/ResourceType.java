package net.awaken.auth.server.entity.resource;

import net.awaken.core.infrastructure.entity.EntityWithEntryPair;

/**
 * <p>
 * 将资源类型分为 <b>资源容器</b> 和 <b>叶子资源</b> <br>
 * <b>资源容器</b> 用于将 <b>叶子资源</b> 做分类配置，便于管理；但不具有直接对其做业务操作{@link ResourceTypeAction}的权限能力<br>
 * <b>叶子资源</b> 具有直接做 业务操作 的权限能力
 * </p>
 *
 * @author Finn Zhao
 * @version 1.0
 * @since 11.05.2018
 */
public class ResourceType extends EntityWithEntryPair<String, String> {

}
