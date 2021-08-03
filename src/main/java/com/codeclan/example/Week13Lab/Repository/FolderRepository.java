package com.codeclan.example.Week13Lab.Repository;

import com.codeclan.example.Week13Lab.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
