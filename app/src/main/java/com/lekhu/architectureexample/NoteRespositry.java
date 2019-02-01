package com.lekhu.architectureexample;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class NoteRespositry {
    private NoteDao noteDao;
    private LiveData<List<Note>> allNotes;

    public NoteRespositry(Application application){
        NoteDatabase database = NoteDatabase.getInstance(application);
        allNotes = noteDao.getAllNote();

    }


    public void insert(Note note){

    }

    public void update(Note note){

    }
    public void delete(Note note){

    }

    public void deleteAllNotes() {
        
    }

    public LiveData<List<Note>> getAllNotes(){
        return allNotes;
    }

}
