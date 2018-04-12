package com.cyberinov8.roomdatabase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by mirza on 4/12/18.
 */
  //todo 2
@Entity(foreignKeys = @ForeignKey(entity = User.class,
        parentColumns = "id",
        childColumns = "userId",
        onDelete = CASCADE))
public class Repo {
    @PrimaryKey(autoGenerate = true)
    public  int id ;
    public final String name;
    public final String url;
    public final int userId;

    public Repo(String name, String url, int userId) {
        this.name = name;
        this.url = url;
        this.userId = userId;
    }

}
