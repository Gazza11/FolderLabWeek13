package com.codeclan.example.Week13Lab.components;

import com.codeclan.example.Week13Lab.Repository.FileRepository;
import com.codeclan.example.Week13Lab.Repository.FolderRepository;
import com.codeclan.example.Week13Lab.Repository.UserRepository;
import com.codeclan.example.Week13Lab.models.File;
import com.codeclan.example.Week13Lab.models.Folder;
import com.codeclan.example.Week13Lab.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){
        User user1 = new User("Steve");
        userRepository.save(user1);

        Folder folder1 = new Folder("Big Folder", user1);
        folderRepository.save(folder1);

        File file1 = new File("First een", ".txt", 100, folder1);
        folder1.addFile(file1);
        fileRepository.save(file1);
        folderRepository.save(folder1);
    }
}
