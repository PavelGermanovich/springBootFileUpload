package com.example.springboot.repository;

import com.example.springboot.model.FileDb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDb, String> {

}
