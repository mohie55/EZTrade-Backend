package com.greenwich.eztrade.Repository;

import com.greenwich.eztrade.Models.Item;
import com.greenwich.eztrade.Models.ItemImage;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemImageRepository extends CrudRepository<ItemImage, Integer> {

    @Query("insert into item_image values (:itemId,:downloadUrl)")
    ItemImage saveItemImage(int itemId, String downloadUrl);

}
