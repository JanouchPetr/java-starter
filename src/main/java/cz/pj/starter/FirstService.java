package cz.pj.starter;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
class FirstService {

    private final SecondService secondService;

    @Inject
    FirstService(SecondService secondService) {
        this.secondService = secondService;
    }

    String greet(String name) {
        return secondService.sayHello() + " " + name + "!";
    }
}
