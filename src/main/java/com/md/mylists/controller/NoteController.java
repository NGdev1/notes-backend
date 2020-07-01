package com.md.mylists.controller;

import com.md.mylists.dao.NoteRepository;
import com.md.mylists.model.Note;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NoteController {

    NoteRepository repository = new NoteRepository();

    @RequestMapping(method = RequestMethod.GET, value = "/notes")
    @ResponseBody
    private List<Note> getNotes() {
        return repository.getNotes();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/note/{id}")
    @ResponseBody
    private Note getNotes(@PathVariable Integer id) {
        return repository.getNote(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/note")
    @ResponseBody
    private void addNote(@RequestBody Note note) {
        repository.addNote(note);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/note/{id}")
    @ResponseBody
    private void deleteNote(@RequestBody Note note) {
        repository.updateNote(note);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/note/{id}")
    @ResponseBody
    private void deleteNote(@PathVariable Integer id) {
        repository.deleteNote(id);
    }
}
