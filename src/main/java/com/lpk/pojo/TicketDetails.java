package com.lpk.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketDetails {

	String ticketId;
	String ticketStatus;
	String passname;
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getPassname() {
		return passname;
	}
	public void setPassname(String passname) {
		this.passname = passname;
	}
	public String getPassage() {
		return passage;
	}
	public void setPassage(String passage) {
		this.passage = passage;
	}
	public String getPassdoj() {
		return passdoj;
	}
	public void setPassdoj(String passdoj) {
		this.passdoj = passdoj;
	}
	public String getPasstrain() {
		return passtrain;
	}
	public void setPasstrain(String passtrain) {
		this.passtrain = passtrain;
	}
	String passage;
	String passdoj;
	String passtrain;
}
