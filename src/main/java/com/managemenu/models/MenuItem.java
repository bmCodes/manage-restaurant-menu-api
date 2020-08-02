package com.managemenu.models;

import com.managemenu.constants.ItemType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Document("MenuItems")
public class MenuItem {

    @Field("item_name")
    private String itemName;
    @Field("item_type")
    private String itemType;
    @Field("item_price")
    private double itemPrice;
    @Field("item_desc")
    private String itemDescription;
    @Field("date_added")
    private LocalDateTime dateAdded;
    @Field("last_updated")
    private LocalDateTime lastUpdated;

}
