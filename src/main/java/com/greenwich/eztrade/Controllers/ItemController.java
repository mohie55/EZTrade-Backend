package com.greenwich.eztrade.Controllers;

import com.greenwich.eztrade.Models.Item;
import com.greenwich.eztrade.Models.ItemImage;
import com.greenwich.eztrade.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;


    @PostMapping("/saveItem")
    public HashMap<String, Object> saveItem(@RequestBody Item item) {

        return itemService.saveItem(item);
    }

    @PostMapping("/saveItemImage")
    public HashMap<String, Object> saveItemImage(@RequestBody ItemImage itemImage) {

        return itemService.saveItemImage(itemImage);
    }

    @GetMapping("/getAllItemLocations")
    public HashMap<String, Object> getItemLocations() {

        return itemService.getAllItemLocations();
    }

    @GetMapping("/getItemLocations")
    public HashMap<String, Object> getItemLocations(String searchQuery) {

        return itemService.getItemLocations(searchQuery);
    }

    @GetMapping("/getImageUrls")
    public HashMap<String, Object> getImageUrls(int itemId) {

        return itemService.getImageUrls(itemId);
    }




}
