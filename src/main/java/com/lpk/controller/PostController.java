package com.lpk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lpk.pojo.PassengerDetails;
import com.lpk.pojo.TicketDetails;

@RestController
public class PostController {

	
//	@PostMapping(value="/booking" , produces = {"application/json" , "application/xml"} ,
//			consumes = {"application/json" , "application/xml"} )
//	
//	public TicketDetails bookTicket (@RequestBody PassengerDetails pd ) {
//		
//		TicketDetails td  = new TicketDetails();
//		td.setTicketId("105");
//		td.setPassname(pd.getName());
//		td.setTicketStatus("Confirmed");
//		td.setPassdoj(pd.getDoj());
//		td.setPasstrain(pd.getTrain());
//		return td ;
//	}
	
	
	//ResponseEntity
	@PostMapping(value="/booking" , produces = {"application/json" , "application/xml"} ,
			consumes = {"application/json" , "application/xml"} )
	
	public ResponseEntity<TicketDetails> bookTicket (@RequestBody PassengerDetails pd ) {
		
		TicketDetails td  = new TicketDetails();
		td.setTicketId("105");
		td.setPassname(pd.getName());
		td.setTicketStatus("Confirmed"); 
		td.setPassdoj(pd.getDoj());
		td.setPasstrain(pd.getTrain());
		return new ResponseEntity<TicketDetails> (td , HttpStatus.CREATED);
	}
}
