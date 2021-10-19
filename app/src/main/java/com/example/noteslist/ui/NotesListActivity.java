package com.example.noteslist.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.noteslist.R;
import com.example.noteslist.domain.NoteEntity;
import com.example.noteslist.domain.NotesRepository;
import com.example.noteslist.impl.NotesRepoImpl;

public class NotesListActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private NotesAdapter notesAdapter = new NotesAdapter();
    private NotesRepository notesRepo = new NotesRepoImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(notesAdapter);
        notesAdapter.setData(notesRepo.getNotes());

        notesRepo.createNote(new NoteEntity(1,"note 1","I am note 1"));
        notesRepo.createNote(new NoteEntity(2,"note 2","I am note 2"));
        notesRepo.createNote(new NoteEntity(3,"note 3","I am note 3"));
        notesRepo.createNote(new NoteEntity(4,"note 4","I am note 4"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.notes_list_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.new_note_menu) {
            openNewNoteScreen();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openNewNoteScreen(){
        Intent intent = new Intent(this, NotesEditActivity.class);
        startActivity(intent);
    }
}