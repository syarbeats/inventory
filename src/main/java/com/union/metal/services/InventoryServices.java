package com.union.metal.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.union.metal.dao.*;
import com.giomatic.entities.remote.*;

public class InventoryServices {

	public List<AppFdInventory> getInventoryData(String namabarang)
	{
		
		InventoryDAO inventoryDAO =  new InventoryDAO();
		List<AppFdInventory> inventoryData = inventoryDAO.getInventoryData(namabarang);
		
		return inventoryData;
	}
		
}
