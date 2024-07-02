package org.xj.commons.web3j.protocol.core;

import lombok.Getter;
import lombok.Setter;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.Response;

import java.util.Map;

/**
 * Tron的full node http api请求体
 *
 * @author xj
 * @version 1.0.0 createTime:  2023/10/24 16:24
 */
public class TronRequest<S, T extends Response> extends NonJsonRpcRequest<S, T> {

    @Setter
    @Getter
    private String tronApiVersion = "2.0";

    public TronRequest() {
    }

    /**
     * 说明：
     *
     * @param method       拼接在请求路径末尾，诸如https://api.trongrid.io/wallet/{method}
     * @param params       作为请求的JSONBody
     * @param web3jService 发送请求的执行器
     * @param type         返回参数类型
     * @param httpMethod   指明是post方法，还是get方法，需要全小写
     */

    public TronRequest(String method, Map<String, Object> params, Web3jService web3jService, Class<T> type, String httpMethod) {
        super(method, params, web3jService, type, httpMethod);

    }

    public Map<String, Object> getTronParams() {
        return this.getParamsMap();
    }
}