package com.example.noteslist.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteslist.R;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public TextView titleTextView = itemView.findViewById(R.id.title_text_view);
    public TextView noteBodyTextView = itemView.findViewById(R.id.note_body_text_view);
}
