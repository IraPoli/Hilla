package com.application.endpoints.helloreact;

import com.application.entity.First;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

import java.util.List;

@Endpoint
@AnonymousAllowed
public class FirstEndpoint {


private  FirstRepository firstRepository;

FirstEndpoint(FirstRepository firstRepository){
    this.firstRepository = firstRepository;
}

public List<First> findAll(){
    return firstRepository.findAll();
}

public First add(String task){
    return firstRepository.save(new First(task));
}

public First update(First first){
    return firstRepository.save(first);
}

 /*   @Nonnull
    public String sayHello(@Nonnull String name) {
        if (name.isEmpty()) {
            return "Hello stranger";
        } else {
            return "Hello " + name;
        }
    }
    */
}