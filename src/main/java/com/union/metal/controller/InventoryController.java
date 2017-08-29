package com.union.metal.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.giomatic.entities.remote.AppFdInventory;
import com.union.metal.services.InventoryServices;

@Path("/inventorydata")
public class InventoryController {

	InventoryServices inventoryServices = new InventoryServices();
	
	@GET
    @Path("/{namabarang}")
    @Produces(MediaType.APPLICATION_XML)
	public List<AppFdInventory> getInventoryByNamaBarang(@PathParam("namabarang") String namabarang)
	{
		return inventoryServices.getInventoryData(namabarang);
	}
}
