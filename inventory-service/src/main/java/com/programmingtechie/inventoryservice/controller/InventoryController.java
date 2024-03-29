package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.service.InventoryService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {


    private final InventoryService inventoryService;


    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)

    public boolean isInStock(@PathVariable("sku-code") String skuCode){

        return inventoryService.isInStock(skuCode);
    }
}
