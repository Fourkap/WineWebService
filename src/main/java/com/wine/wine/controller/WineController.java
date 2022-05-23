package com.wine.wine.controller;

import com.wine.wine.dao.WineDao;
import com.wine.wine.entity.Wine;
import com.wine.wine.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/api/wine")
public class WineController {
    @Autowired
    WineDao wineDao;
    @Autowired
    WineService wineService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public Page<Wine> getAllWines(@RequestParam Optional<Integer> page) {
        return wineService.getAllWines(page.orElse(0));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Wine> GetOneWine(@PathVariable Integer id) {
        return this.wineService.getOneWine(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void DeleteOneWine(@PathVariable Integer id) {
        this.wineService.deleteOneWine(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void UpdateOneWine(@PathVariable Integer id, @RequestBody Wine wine) {
        this.wineService.UpdateWine(wine, id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Wine addNewWine(@RequestBody Wine wine) {
        return this.wineService.addWine(wine);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getnextid")
    public Long GetNextId(){
        return this.wineService.getNextId();
    }
}

