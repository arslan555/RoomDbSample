package com.cyberinov8.roomdatabase;

/**
 * Created by mirza on 4/12/18.
 */

//solution for many to many relationship
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

@Entity(tableName = "user_repo_join",
        primaryKeys = { "userId", "repoId" },
        foreignKeys = {
                @ForeignKey(entity = User.class,
                        parentColumns = "id",
                        childColumns = "userId"),
                @ForeignKey(entity = Repo.class,
                        parentColumns = "id",
                        childColumns = "repoId")
        })
public class UserRepoJoin {
    public final int userId;
    public final int repoId;

    public UserRepoJoin(final int userId, final int repoId) {
        this.userId = userId;
        this.repoId = repoId;
    }
}