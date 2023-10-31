package com.Abhishek.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Abhishek.Serv.InventoryService;
import com.Abhishek.model.Inventory;

@RestController
public class InventoryController {
	@Autowired
	private InventoryService inventServ;
	
	@PostMapping("/register")
	public String addData(@ModelAttribute Inventory inventory)
	{
		inventServ.add(inventory);
		return "   <center>\r\n"
				+ "    <h1 style=\"color: green;\">Task executed successfully!!!</h1>\r\n"
				+ "    <a href=\"/db\" style=\"text-decoration: wavy;\"><button style=\"border: none; display: flex;height: 30px; box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19); background-color: aquamarine;padding: 5px; font-weight: bold;\">Click here to continue</button></a>\r\n"
				+ "</center>";
	}
	
	@GetMapping(value={"/inventory"})
	public List<Inventory> getAllData()
	{
		return inventServ.getAll();
	}
	
	@DeleteMapping(value= {"/inventory/{id}"})
	public String deleteById(@PathVariable int id)
	{
		inventServ.removeById(id);
		return "success";
	}
	
	@GetMapping(value={"/inventory/{id}"})
	public Inventory selectById(@PathVariable int id)
	{
		return inventServ.getById(id);
	}
	
	
	
	
}
