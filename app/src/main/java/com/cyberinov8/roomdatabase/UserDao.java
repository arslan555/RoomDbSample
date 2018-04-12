package com.cyberinov8.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by mirza on 4/12/18.
 */


@Dao
public interface UserDao {

    @Insert
    void insert(User... user);

    @Update
    void update(User... user);

    @Delete
    void delete(User... user);
    @Delete
    void deleteAllUsers(List<User> users);

    @Query("select * from user where id=:u_id")
    User getUser(int u_id);

    @Query("select * from user")
    List<User> getAllUsers();

}