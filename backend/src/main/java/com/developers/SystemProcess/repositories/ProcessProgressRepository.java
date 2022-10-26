package com.developers.SystemProcess.repositories;

import com.developers.SystemProcess.entities.ProgressProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessProgressRepository extends JpaRepository<ProgressProcess, Long> {

}
