package cn.itcast.dao;

import cn.itcast.domain.Items;

public interface ItemsDao {
    Items findById(int id);
}
