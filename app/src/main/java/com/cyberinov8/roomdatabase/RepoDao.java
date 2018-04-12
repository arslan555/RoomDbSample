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
//todo 3
@Dao
public interface RepoDao {
    @Insert
    void insert(Repo... repo);
    @Update
    void update(Repo...  repos);
    @Delete
    void delete(Repo... repos);
    @Delete
    void deleteAllRepos(List<Repo> repos);
    @Query("select * from repo")
    List<Repo> getAllRepos();
    @Query("SELECT * FROM repo WHERE id=:id")
    Repo getRepo(int id);

    @Query("SELECT * FROM repo WHERE userId=:userId")
    List<Repo> findRepositoriesForUser(final int userId);
}
