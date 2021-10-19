package com.example.noteslist.impl;

import com.example.noteslist.domain.NotesRepository;
import com.example.noteslist.domain.NoteEntity;

import java.util.ArrayList;
import java.util.List;

public class NotesRepoImpl implements NotesRepository {
    private ArrayList<NoteEntity> cache = new ArrayList<>();
    private int counter = 0;

    @Override
    public List<NoteEntity> getNotes() {
        return new ArrayList<>(cache);
    }

    @Override
    public Integer createNote(NoteEntity note) {
        note.setNoteId(++counter);
        cache.add(note);
        return counter;
    }

    @Override
    public boolean deleteNote(int id) {
        for (int i = 0; i < cache.size(); i++) {
            if(cache.get(i).getNoteId() == id) {
                cache.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editNote(int id, NoteEntity note) {
        deleteNote(id);
        note.setNoteId(id);
        cache.add(note);
        return true;
    }
}
