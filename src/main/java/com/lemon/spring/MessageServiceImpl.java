package com.lemon.spring;

import org.springframework.stereotype.Service;

/**
 * Created by 305032265 on 14-8-8.
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello world!\nI am using annotation config...";
    }
}
