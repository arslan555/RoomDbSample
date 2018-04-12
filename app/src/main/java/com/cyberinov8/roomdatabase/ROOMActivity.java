package com.cyberinov8.roomdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ROOMActivity extends AppCompatActivity {
    List<Repo> repos;
    List<User> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        RepoDao repoDao = RepoDatabase
                .getInstance(this)
                .getRepoDao();

        UserDao userDao = RepoDatabase
                .getInstance(this)
                .getUserDao();

//        userDao.insert(new User(
//                "Jake Wharton",
//                "https://avatars0.githubusercontent.com/u/66577"));
//        userDao.insert(new User(
//                "Jake Wharton2",
//                "https://avatars0.githubusercontent.com/u/66577"));
//
//
//        repoDao.insert(new Repo(
//                "test1",
//                "https://github.com/square/retrofit",
//                1));
//        repoDao.insert(new Repo(
//                "test2",
//                "https://github.com/square/retrofit",
//                1));
//        repoDao.insert(new Repo(
//                "test3",
//                "https://github.com/square/retrofit",
//                1));
//        repoDao.insert(new Repo(
//                "test4",
//                "https://github.com/square/retrofit",
//                1));
//                repoDao.insert(new Repo(
//                "test4",
//                "https://github.com/square/retrofit",
//                2));
//        repoDao.insert(new Repo(
//                "test4",
//                "https://github.com/square/retrofit",
//                2));
//        repos = repoDao.getAllRepos();
//        User user = userDao.getUser(repos.get(5).userId);
//        Toast.makeText(this, ""+user.login +user.avatarUrl , Toast.LENGTH_SHORT).show();
        // repoDao.deleteAllRepos(repos);
        users =userDao.getAllUsers();
        repos = repoDao.getAllRepos();
//        userDao.deleteAllUsers(users);



    }
}
