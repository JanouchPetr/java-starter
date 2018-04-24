package cz.pj.starter;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
class FirstService {

    @Inject
    private SecondService secondService;

    String greet(String name) {
        return secondService.sayHello() + " " + name + "!";
    }
}
