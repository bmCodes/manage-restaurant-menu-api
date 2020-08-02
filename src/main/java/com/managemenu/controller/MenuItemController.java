package com.managemenu.controller;

import com.managemenu.models.MenuItem;
import com.managemenu.repository.MenuItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuItemController {
    private final MenuItemRepository menuItemRepository;

    @PostMapping("/save/menuItem")
    MenuItem newMenuItem(@RequestBody MenuItem menuItem){
        return menuItemRepository.saveMenuItem(menuItem);
    }

    @PostMapping("/get/menuItem")
    MenuItem findMenuItem(@RequestBody MenuItem menuItem){
        return menuItemRepository.getMenuItem(menuItem.getItemName());
    }
}
