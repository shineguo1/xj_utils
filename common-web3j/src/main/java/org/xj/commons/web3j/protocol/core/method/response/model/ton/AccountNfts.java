package org.xj.commons.web3j.protocol.core.method.response.model.ton;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * @author xj
 * @version 1.0.0 createTime:  2023/12/15 16:47
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AccountNfts {
    private List<NftItem> nft_items;
}