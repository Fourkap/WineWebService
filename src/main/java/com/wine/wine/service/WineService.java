package com.wine.wine.service;

import com.wine.wine.dao.WineDao;
import com.wine.wine.entity.Wine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineService {
    @Autowired
    WineDao wineDao;

    public List<Wine> getAllWines() {
        return this.wineDao.findAll();
    }

    public Wine addWine(Wine wine) {
        return this.wineDao.save(wine);
    }
}