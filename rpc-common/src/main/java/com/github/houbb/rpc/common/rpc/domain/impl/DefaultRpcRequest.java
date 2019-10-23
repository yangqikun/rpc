package com.github.houbb.rpc.common.rpc.domain.impl;

import com.github.houbb.rpc.common.rpc.domain.RpcRequest;

import java.util.Arrays;
import java.util.List;

/**
 * 默认 rpc 入参
 * @author binbin.hou
 * @since 0.0.6
 * @see Class#getMethod(String, Class[]) 反射获取方法信息
 * @see java.lang.reflect.Method#invoke(Object, Object...) 方法反射调用
 */
public class DefaultRpcRequest implements RpcRequest {

    private static final long serialVersionUID = 4284511516221766313L;

    /**
     * 唯一标识号
     * （）
     * @since 0.0.6
     */
    private String seqId;

    /**
     * 创建时间
     * @since 0.0.6
     * @see System#currentTimeMillis() 当前时间
     */
    private long createTime;

    /**
     * 服务名称唯一标识
     * @since 0.0.6
     */
    private String serviceId;

    /**
     * 方法名称
     * @since 0.0.6
     */
    private String methodName;

    /**
     * 参数类型名称列表
     * @since 0.0.6
     */
    private List<String> paramTypeNames;

    /**
     * 参数值
     * @since 0.0.6
     */
    private Object[] paramValues;

    @Override
    public String seqId() {
        return seqId;
    }

    @Override
    public DefaultRpcRequest seqId(String seqId) {
        this.seqId = seqId;
        return this;
    }

    @Override
    public long createTime() {
        return createTime;
    }

    public DefaultRpcRequest createTime(long createTime) {
        this.createTime = createTime;
        return this;
    }

    @Override
    public String serviceId() {
        return serviceId;
    }

    public DefaultRpcRequest serviceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Override
    public String methodName() {
        return methodName;
    }

    public DefaultRpcRequest methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    @Override
    public List<String> paramTypeNames() {
        return paramTypeNames;
    }

    public DefaultRpcRequest paramTypeNames(List<String> paramTypeNames) {
        this.paramTypeNames = paramTypeNames;
        return this;
    }

    @Override
    public Object[] paramValues() {
        return paramValues;
    }

    public DefaultRpcRequest paramValues(Object[] paramValues) {
        this.paramValues = paramValues;
        return this;
    }

    @Override
    public String toString() {
        return "DefaultRpcRequest{" +
                "seqId='" + seqId + '\'' +
                ", createTime=" + createTime +
                ", serviceId='" + serviceId + '\'' +
                ", methodName='" + methodName + '\'' +
                ", paramTypeNames=" + paramTypeNames +
                ", paramValues=" + Arrays.toString(paramValues) +
                '}';
    }
}