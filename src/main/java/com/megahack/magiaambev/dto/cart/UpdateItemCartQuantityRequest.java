package com.megahack.magiaambev.dto.cart;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateItemCartQuantityRequest {
    @JsonProperty("store_id")
    private Integer storeId;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("quantity")
    private Integer quantity;
}
