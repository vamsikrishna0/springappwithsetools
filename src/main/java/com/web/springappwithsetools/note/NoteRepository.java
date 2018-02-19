package com.web.springappwithsetools.note;


import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, String>{
}
