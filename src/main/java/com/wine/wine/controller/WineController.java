package com.wine.wine.controller;

import com.wine.wine.entity.Wine;
import com.wine.wine.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wine")
public class WineController {
    @Autowired
    WineService wineService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Wine> getAllWines()
    {
        return wineService.getAllWines();
    }

    @RequestMapping(value = "/addwine", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()

    public Wine addNewWine(@RequestBody Wine wine)
    {
        return this.wineService.addWine(wine);
    }
}
