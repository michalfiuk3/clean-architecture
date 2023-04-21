package com.android.example.core.usecase

import com.android.example.core.data.Note
import com.android.example.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}