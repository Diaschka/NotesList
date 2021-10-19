package com.example.noteslist.domain;

import java.util.List;

public interface NotesRepository {

    List<NoteEntity> getNotes();

    Integer createNote(NoteEntity note);
    boolean deleteNote(int id);
    boolean editNote(int id, NoteEntity note);
}
