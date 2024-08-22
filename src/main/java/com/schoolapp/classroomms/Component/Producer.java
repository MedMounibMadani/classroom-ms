package com.schoolapp.classroomms.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.schoolapp.classroomms.models.ClassRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
public class Producer {
    @Value("${topic.name}")
    private String postTopic;

    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public String sendMessage(ClassRoom cr) throws JsonProcessingException {
        String classRm = objectMapper.writeValueAsString(cr);
        kafkaTemplate.send(postTopic, classRm);
        return "classroom microservice";
    }
}
