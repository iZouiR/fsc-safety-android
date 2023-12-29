package com.bsu.fsc_safety_android.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.bsu.fsc_safety_android.dao.ModuleDao;
import com.bsu.fsc_safety_android.entity.Module;

@Database(entities = {Module.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ModuleDao moduleDao();
}
