package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item_order")
public class Item_Order {
    private String idOrder;
    private String idItem;
}
