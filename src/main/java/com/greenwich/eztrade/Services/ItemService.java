package com.greenwich.eztrade.Services;

import com.greenwich.eztrade.Models.Item;
import com.greenwich.eztrade.Repository.ItemRepository;
import com.greenwich.eztrade.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    HashMap<String, Object> itemResponse;

    public HashMap<String, Object> saveItem(Item item) {

        itemResponse = new HashMap<>();
        try {
            Item savedItem = itemRepository.save(item);

            itemResponse.put("message", "success");
            itemResponse.put("item", savedItem);
        } catch (Exception e){
            e.printStackTrace();
            itemResponse.put("message", "failed");
//            itemResponse.put("item", null);
        }


        return itemResponse;
    }
}
