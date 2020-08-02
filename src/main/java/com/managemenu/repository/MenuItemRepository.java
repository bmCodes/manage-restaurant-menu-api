package com.managemenu.repository;

import com.managemenu.models.MenuItem;

public interface MenuItemRepository {

    MenuItem getMenuItem(String nameItem);

    MenuItem saveMenuItem(MenuItem menuItem);
}
