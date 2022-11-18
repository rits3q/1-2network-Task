package com.example.Prudtask.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Prudtask.Entity.Betting;
import com.example.Prudtask.Repository.BetsRepo;

import java.util.List;
import java.util.Map;


@RestController
public class BetController {
	

	    @Autowired
	    BetsRepo betsRepo;

	    @PostMapping(path="/add")
		@ResponseBody 
		public  String addNewBets (@RequestBody Betting betting) {
	
			betsRepo.save(betting);
			return "Saved";
		}

		@GetMapping(path="/all")
		
		@ResponseBody
		public Iterable<Betting> getAllUsers() {
			
			return betsRepo.findAll();  // This returns a JSON with the bets
		}
		
		 @DeleteMapping("bet/{id}")
		    public boolean delete(@PathVariable int id){
		       
		        betsRepo.deleteById(id);
		        return true;
		 }


	}


