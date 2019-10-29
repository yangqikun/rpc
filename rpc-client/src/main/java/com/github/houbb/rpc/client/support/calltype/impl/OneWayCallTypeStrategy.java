package com.github.houbb.rpc.client.support.calltype.impl;

import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.log.integration.core.Log;
import com.github.houbb.log.integration.core.LogFactory;
import com.github.houbb.rpc.client.proxy.ProxyContext;
import com.github.houbb.rpc.client.support.calltype.CallTypeStrategy;
import com.github.houbb.rpc.common.rpc.domain.RpcRequest;
import com.github.houbb.rpc.common.rpc.domain.RpcResponse;
import com.github.houbb.rpc.common.rpc.domain.impl.RpcResponses;

/**
 * one way 调用服务实现类
 *
 * @author binbin.hou
 * @since 0.1.0
 */
@ThreadSafe
class OneWayCallTypeStrategy implements CallTypeStrategy {

    private static final Log LOG = LogFactory.getLog(OneWayCallTypeStrategy.class);

    /**
     * 实例
     *
     * @since 0.1.0
     */
    private static final CallTypeStrategy INSTANCE = new OneWayCallTypeStrategy();

    /**
     * 获取实例
     *
     * @since 0.1.0
     */
    public static CallTypeStrategy getInstance() {
        return INSTANCE;
    }

    @Override
    public Object result(ProxyContext proxyContext, RpcRequest rpcRequest) {
        final String seqId = rpcRequest.seqId();

        // 结果可以不是简单的 null，而是根据 result 类型处理，避免基本类型NPE。
        RpcResponse rpcResponse = RpcResponses.result(null, rpcRequest.returnType());
        LOG.info("[Client] call type is one way, seqId: {} set response to {}", seqId, rpcResponse);

        // 获取结果
        return RpcResponses.getResult(rpcResponse);
    }

}
