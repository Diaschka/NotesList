package com.example.noteslist.ui;

public class NoteEntity {
    private int noteId;
    private String noteTitle;
    private String noteBody;

    public NoteEntity(int noteId, String noteTitle, String noteBody) {
        this.noteId = noteId;
        this.noteTitle = noteTitle;
        this.noteBody = noteBody;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }
}
