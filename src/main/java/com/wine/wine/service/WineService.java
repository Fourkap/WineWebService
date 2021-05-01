package com.wine.wine.service;

import com.wine.wine.dao.WineDao;
import com.wine.wine.entity.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WineService {
    @Autowired
    WineDao wineDao;

    public List<Wine> getAllWines() {
        return this.wineDao.findAll();
    }

    public Optional<Wine> getOneWine(Integer id){
        return this.wineDao.findById(id);
    }

    public void deleteOneWine(Integer id){
        this.wineDao.deleteById(id);
    }

    public Wine addWine(Wine wine) {
        return this.wineDao.save(wine);
    }

    public Wine UpdateWine(Wine wine, Integer id) {
        this.wineDao.findById(id);
        wine.setId(id);
        return this.wineDao.save(wine);
    }

}