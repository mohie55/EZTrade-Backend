package com.greenwich.eztrade.Controllers;

import com.greenwich.eztrade.Models.Item;
import com.greenwich.eztrade.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/save_item")
    public HashMap<String, Object> saveItem(@RequestBody Item item) {

        return itemService.saveItem(item);
    }
}
