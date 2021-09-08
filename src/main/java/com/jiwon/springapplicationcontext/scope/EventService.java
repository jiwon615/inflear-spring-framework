package com.jiwon.springapplicationcontext.scope;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @NonNull
    public String creatEvent(@NonNull String name) {
        return "hello " + name;
    }
}
