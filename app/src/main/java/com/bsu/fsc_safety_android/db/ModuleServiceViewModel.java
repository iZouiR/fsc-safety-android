package com.bsu.fsc_safety_android.db;

import androidx.lifecycle.ViewModel;

import com.bsu.fsc_safety_android.App;
import com.bsu.fsc_safety_android.entity.Module;

import java.util.List;

public class ModuleServiceViewModel extends ViewModel {
    public List<Module> getAllModules() {
        AppDatabase database = App.getInstance().getDatabase();
        return database.moduleDao().getAll();
    }

    public Module getModuleById(Long id) {
        AppDatabase database = App.getInstance().getDatabase();
        return database.moduleDao().getById(id);
    }
}
