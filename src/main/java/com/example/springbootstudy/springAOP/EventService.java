package com.example.springbootstudy.springAOP;

import org.springframework.stereotype.Service;

@Service
public interface EventService {
    void createEvent();
    void publishEvent();
    void deleteEvent();
}
