package com.wine.wine.service;

import com.wine.wine.dao.WineDao;
import com.wine.wine.entity.Wine;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class WineService {
    @Autowired
    WineDao wineDao;

    public Page<Wine> getAllWines(Integer page) {
        return this.wineDao.findAll(PageRequest.of(page,15));
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

    public Wine GetLastId(){
        List<Wine> wines = this.wineDao.findAll();
        Wine wine = wines.get(wines.size()-1);
        return wine;
    }

    @Autowired
    EntityManager em;

    public Long getNextId() {

        Query q = em.createNativeQuery("SELECT HIBERNATE_SEQUENCE.nextval from DUAL");
        BigDecimal result=(BigDecimal)q.getSingleResult();
        return result.longValue();
    }

}