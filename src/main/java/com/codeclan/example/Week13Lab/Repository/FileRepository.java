package com.codeclan.example.Week13Lab.Repository;

import com.codeclan.example.Week13Lab.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
