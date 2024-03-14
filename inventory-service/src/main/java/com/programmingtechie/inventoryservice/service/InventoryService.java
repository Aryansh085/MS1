package com.programmingtechie.inventoryservice.service;

import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InventoryService {


    private final InventoryRepository inventoryRepository;

    @Transactional()
    public boolean isInStock (String skuCode){
        Long i = 1234L;
return inventoryRepository.findBySkuCode(skuCode).isPresent();
        //return true;
    }

}
