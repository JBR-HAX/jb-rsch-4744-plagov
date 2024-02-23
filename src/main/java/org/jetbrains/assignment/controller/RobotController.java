package org.jetbrains.assignment.controller;

import org.jetbrains.assignment.model.Command;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/robots")
public class RobotController {

    @PostMapping("/commands")
    public ResponseEntity<Void> processCommands(@RequestBody List<Command> commands) {
        // Logic to process the commands
        return ResponseEntity.ok().build();
    }
}
