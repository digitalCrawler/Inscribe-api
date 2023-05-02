package com.mars.inscribe.inscribe.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Notes")
public class NoteModel {
	
	public NoteModel() {
		this.Body = "";
		this.Title = "";
		this.CreatedOn = new Date();
		this.UpdatedOn = new Date();
		this.connectedUsers = new ArrayList<UUID>();
	}
	
	public NoteModel(String title) {
		this.Body = "";
		this.Title = title;
		this.CreatedOn = new Date();
		this.UpdatedOn = new Date();
		this.connectedUsers = new ArrayList<UUID>();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public UUID Id;
	public String Title;
	public String Body;
	public Date CreatedOn;
	public Date UpdatedOn;
	
	public ArrayList<UUID> connectedUsers;
	
}
