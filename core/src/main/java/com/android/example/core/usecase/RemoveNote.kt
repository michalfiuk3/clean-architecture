package com.android.example.core.usecase

import com.android.example.core.data.Note
import com.android.example.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}