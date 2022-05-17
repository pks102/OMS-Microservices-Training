package demo.dto.copy;

import lombok.Data;

@Data
public class ProductCreateReqDto {
    private Long productId;
    private Long storeId;
    private String productName;
    private String productDescription;
    private Double price;
}
