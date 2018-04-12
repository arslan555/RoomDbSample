package com.cyberinov8.roomdatabase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by mirza on 4/12/18.
 */

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public  int id;
    public final String login;
    public final String avatarUrl;

    public User(String login, String avatarUrl) {
        this.login = login;
        this.avatarUrl = avatarUrl;
    }
}
