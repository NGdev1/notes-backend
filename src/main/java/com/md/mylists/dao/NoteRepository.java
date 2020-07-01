package com.md.mylists.dao;

import com.md.mylists.model.Note;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteRepository {
    private final Map<Integer, Note> notes = new HashMap<>();

    public NoteRepository() {}

    public void addNote(Note note) {
        note.setId(notes.size());
        notes.put(note.getId(), note);
    }

    public List<Note> getNotes() {
        return new ArrayList<>(notes.values());
    }

    public Note getNote(Integer id) {
        return notes.get(id);
    }

    public void updateNote(Note note) {
        notes.replace(note.getId(), note);
    }

    public void deleteNote(Note note) {
        notes.remove(note.getId());
    }

    public void deleteNote(Integer id) {
        notes.remove(id);
    }
}
