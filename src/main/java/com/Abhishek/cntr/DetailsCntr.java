package com.Abhishek.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Abhishek.Serv.DetailsServ;
import com.Abhishek.model.Details;
@RestController
public class DetailsCntr {
	@Autowired
	private DetailsServ detServ;
	
	@PostMapping(value= {"/load"})
	public String loadData(@ModelAttribute Details details)
	{
		detServ.add(details);
		return  "   <center>\r\n"
		+ "    <h1 style=\"color: green;\">Task executed successfully!!!</h1>\r\n"
		+ "    <a href=\"/index\" style=\"text-decoration: wavy;\"><button style=\"border: none; display: flex;height: 30px; box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19); background-color: aquamarine;padding: 5px; font-weight: bold;\">Click here to continue</button></a>\r\n"
		+ "</center>";
	}

}
