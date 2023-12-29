package com.bsu.fsc_safety_android.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.bsu.fsc_safety_android.entity.Module;

import java.util.List;

@Dao
public interface ModuleDao {
    @Query("SELECT * FROM module")
    List<Module> getAll();

    @Query("SELECT * FROM module WHERE id = :id")
    Module getById(Long id);
}
