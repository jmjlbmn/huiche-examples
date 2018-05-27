package org.huiche.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maning
 */
@RestController
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to Huiche";
    }
}
