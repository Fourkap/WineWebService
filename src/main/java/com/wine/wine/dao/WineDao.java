package com.wine.wine.dao;

import com.wine.wine.entity.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WineDao extends JpaRepository<Wine, Integer> {
}
