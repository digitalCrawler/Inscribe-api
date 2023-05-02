package com.mars.inscribe.inscribe.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mars.inscribe.inscribe.models.NoteModel;


@Repository
public interface NoteRepository extends CrudRepository<NoteModel, UUID> {

}
