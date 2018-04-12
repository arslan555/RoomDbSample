package com.cyberinov8.roomdatabase;

/**
 * Created by mirza on 4/12/18.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

@Dao
public interface UserRepoJoinDao {
    @Insert
    void insert(UserRepoJoin userRepoJoin);

    @Query("SELECT * FROM user INNER JOIN user_repo_join on user.id = user_repo_join.userId where user_repo_join.repoId=:repoId")
    List<User> getUsersForRepository(int repoId);


}