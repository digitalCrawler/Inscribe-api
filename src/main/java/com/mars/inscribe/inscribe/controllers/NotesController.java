package com.mars.inscribe.inscribe.controllers;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.inscribe.inscribe.models.NoteModel;

@RestController
@RequestMapping("notes")
public class NotesController {	
	@GetMapping()
	public ResponseEntity<ArrayList<NoteModel>> GetAllNotes() {
		var arrayList = new ArrayList<NoteModel>() {};
		
		arrayList.add(new NoteModel() {});
		arrayList.add(new NoteModel() {});
		
		return ResponseEntity.ok( arrayList );
	}
	
	@GetMapping("{id}")
	public ResponseEntity<NoteModel> GetNote(@PathVariable UUID id ) throws IllegalArgumentException {
		return ResponseEntity.ok( new NoteModel() {});
	}
	
	@PostMapping()
	public ResponseEntity<NoteModel> CreateNote(@RequestBody NoteModel note){
		return ResponseEntity.ok(new NoteModel() {});
	}
	
	@PutMapping()
	public ResponseEntity<NoteModel> UpdateNote(){
		return ResponseEntity.ok(new NoteModel() {});
	}
	
	@DeleteMapping()
	public ResponseEntity<Boolean> DeleteNote(){
		return ResponseEntity.ok(true);
	}
}
