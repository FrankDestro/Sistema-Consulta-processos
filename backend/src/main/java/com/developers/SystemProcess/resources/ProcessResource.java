package com.developers.SystemProcess.resources;

import com.developers.SystemProcess.dto.ProcessDTO;
import com.developers.SystemProcess.services.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/process")
public class ProcessResource {

    @Autowired
    private ProcessService service;

    @GetMapping
    public ResponseEntity<Page<ProcessDTO>> findAllProjects(Pageable pageable) {
        Page<ProcessDTO> list = service.findAllProcess(pageable);
        return ResponseEntity.ok().body(list);
    }
}
