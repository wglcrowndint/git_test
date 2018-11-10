package com.itheima.dao;

import com.itheima.domain.Items;

public interface ItemsDao {
    public Items findById(Integer id);
    public void add(Items items);
    public void update(Items items);
}
