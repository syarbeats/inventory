package com.union.metal.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.backend.hibernate.*;
import com.giomatic.entities.remote.AppFdInventory;


public class InventoryDAO {

	public List<AppFdInventory> getInventoryData(String CNamaBarang){
        Session session = SessionUtil.getSession();    
        Query query = session.createQuery("from AppFdInventory where CNamaBarang like :CNamaBarang");
        query.setParameter("CNamaBarang", "%" + CNamaBarang.toUpperCase() + "%");
        List<AppFdInventory> inventory =  query.list();
        return inventory;
    }
	
}
