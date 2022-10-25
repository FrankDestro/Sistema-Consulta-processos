package com.developers.SystemProcess.services;

import com.developers.SystemProcess.dto.ProcessDTO;
import com.developers.SystemProcess.entities.Process;
import com.developers.SystemProcess.repositories.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProcessService {

    @Autowired
    private ProcessRepository repository;

    @Transactional(readOnly = true)
    public Page<ProcessDTO> findAllProcess(Pageable pageable) {
        Page<Process> list = repository.findAll(pageable);
        return list.map(x -> new ProcessDTO(x));
    }

}
