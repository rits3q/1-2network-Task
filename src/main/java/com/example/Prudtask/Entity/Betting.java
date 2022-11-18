package com.example.Prudtask.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bets")
public class Betting {
    
	@Id
	@GeneratedValue
	private int id;
	private int numbets;
	private String game;
	private int stake;
	private double returns;
	private int clientid ;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumbets() {
		return numbets;
	}
	public void setNumbets(int numbets) {
		this.numbets = numbets;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public int getStake() {
		return stake;
	}
	public void setStake(int stake) {
		this.stake = stake;
	}
	public double getReturns() {
		return returns;
	}
	public void setReturns(double returns) {
		this.returns = returns;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
}
