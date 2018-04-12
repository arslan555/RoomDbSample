package com.cyberinov8.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by mirza on 4/12/18.
 */
//todo 4
@Database(entities = { Repo.class , User.class  ,UserRepoJoin.class}, version = 3  )
public abstract class RepoDatabase  extends RoomDatabase{

    private static final String DB_NAME = "repoDatabase.db";
    private static volatile RepoDatabase instance;

    static synchronized RepoDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    private static RepoDatabase create(final Context context) {
        return Room.databaseBuilder(
                context,
                RepoDatabase.class,
                DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
    }

    public abstract RepoDao getRepoDao();
    public abstract  UserDao getUserDao();


}
