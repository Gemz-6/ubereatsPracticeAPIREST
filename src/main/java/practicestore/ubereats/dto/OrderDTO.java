package practicestore.ubereats.dto;

import lombok.Data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private long orderId;
    private long userId;
    private String name;
    private List<ItemDto> items;
    private double total;
    private String status;
}
