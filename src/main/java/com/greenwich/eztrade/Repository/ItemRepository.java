package com.greenwich.eztrade.Repository;

import com.greenwich.eztrade.DTOs.ItemLocationDTO;
import com.greenwich.eztrade.Models.Item;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

    @Query("select id,latitude,longitude,title,price from item")
    List<ItemLocationDTO> getAllItemLocations();

    @Query("select id,latitude,longitude,title,price from item where title like '%' + :searchQuery + '%'")
    List<ItemLocationDTO> getItemLocations(String searchQuery);

    @Query("select * from item where id = :itemId")
    Item getItem(int itemId);

    @Query("select download_url from item_image where item_id = :itemId")
    List<String> getImageUrls(int itemId);


//    @Query("select title from item where title like '%' + :search + '%'")
//    List<String> getItemLocations(String search);
}
