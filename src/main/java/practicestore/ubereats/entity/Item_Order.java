package practicestore.ubereats.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item_order")
public class Item_Order {
    private String idOrder;
    private String idItem;
}
