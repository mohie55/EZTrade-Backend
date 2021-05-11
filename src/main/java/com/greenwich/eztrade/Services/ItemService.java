package com.greenwich.eztrade.Services;


import com.greenwich.eztrade.DTOs.ItemLocationDTO;
import com.greenwich.eztrade.Models.Item;
import com.greenwich.eztrade.Models.ItemImage;
import com.greenwich.eztrade.Repository.ItemImageRepository;
import com.greenwich.eztrade.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemImageRepository itemImageRepository;

    public HashMap<String, Object> saveItem(Item item) {

        HashMap<String, Object> itemResponse = new HashMap<>();
        try {
            Item savedItem = itemRepository.save(item);

            itemResponse.put("message", "success");
            itemResponse.put("item", savedItem);
        } catch (Exception e){
            e.printStackTrace();
            itemResponse.put("message", "failed");
        }

        return itemResponse;
    }

    public HashMap<String, Object> saveItemImage(ItemImage itemImage) {

        HashMap<String, Object> itemImageResponse = new HashMap<>();
        try {
            ItemImage savedItemImage = itemImageRepository.save(itemImage);

            itemImageResponse.put("message", "success");
            itemImageResponse.put("item", savedItemImage);
        } catch (Exception e){
            e.printStackTrace();
            itemImageResponse.put("message", "failed");
        }

        return itemImageResponse;
    }


    public HashMap<String, Object> getAllItemLocations() {

        HashMap<String, Object> itemLocationResponse = new HashMap<>();

        try {
            List<ItemLocationDTO> itemLocations =  itemRepository.getAllItemLocations();

            itemLocationResponse.put("message", "success");
            itemLocationResponse.put("itemLocationsDTOList", itemLocations);
        } catch (Exception e){
            e.printStackTrace();
            itemLocationResponse.put("message", "failed");
        }
        return  itemLocationResponse;
    }

    public HashMap<String, Object> getItemLocations(String searchQuery) {

        HashMap<String, Object> itemLocationResponse = new HashMap<>();

        try {
            List<ItemLocationDTO> itemLocations =  itemRepository.getItemLocations(searchQuery);

            itemLocationResponse.put("message", "success");
            itemLocationResponse.put("itemLocationsDTOList", itemLocations);
        } catch (Exception e){
            e.printStackTrace();
            itemLocationResponse.put("message", "failed");
        }
        return  itemLocationResponse;
    }

    public HashMap<String, Object> getItem(int itemId) {

        HashMap<String, Object> itemResponse = new HashMap<>();

        try {
            Item item =  itemRepository.getItem(itemId);

            itemResponse.put("message", "success");
            itemResponse.put("item", item);
        } catch (Exception e){
            e.printStackTrace();
            itemResponse.put("message", "failed");
        }
        return  itemResponse;

    }


    public HashMap<String, Object> getImageUrls(int itemId) {

        HashMap<String, Object> imageUrlsResponse = new HashMap<>();

        try {
            List<String> imageUrls =  itemRepository.getImageUrls(itemId);

            imageUrlsResponse.put("message", "success");
            imageUrlsResponse.put("imageUrls", imageUrls);
        } catch (Exception e){
            e.printStackTrace();
            imageUrlsResponse.put("message", "failed");
        }
        return  imageUrlsResponse;
    }

//    public HashMap<String, Object> getItemLocations(String search) {
//
//        HashMap<String, Object> itemLocationDTOSResponse = new HashMap<>();
//
//        try {
//            List<String> itemLocationDTOS =  itemRepository.getItemLocations(search);
//
//            itemLocationDTOSResponse.put("message", "success");
//            itemLocationDTOSResponse.put("itemLocationDTOS", itemLocationDTOS);
//        } catch (Exception e){
//            e.printStackTrace();
//            itemLocationDTOSResponse.put("message", "failed");
//        }
//        return  itemLocationDTOSResponse;
//    }


}
