package org.nikita.pojo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Script {

    private final String id = UUID.randomUUID().toString();
    private final String code;
    private ScriptStatus status;
    private final String stdout;
    private final String stderr;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final LocalDateTime time;
    private final String errorMessage;

}
