package com.managemenu.repository;
import com.managemenu.models.MenuItem;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MenuItemRepositoryImpl implements MenuItemRepository{
    private final MongoOperations mongoOperations;

    public MenuItem getMenuItem(String nameItem){
        Query query = new Query(Criteria.where("item_name").is(nameItem));
        return mongoOperations.findOne(query,MenuItem.class);
    }

    public MenuItem saveMenuItem(MenuItem menuItem){
        return mongoOperations.save(menuItem);
    }
}
