package com.web.springappwithsetools.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    NoteService noteService;

    @RequestMapping(method = RequestMethod.GET, value = "/notes")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @PostMapping("/notes")
    public void addNote(@RequestBody Note note){
        noteService.addNote(note);
    }
}
