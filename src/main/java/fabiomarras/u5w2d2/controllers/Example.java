package fabiomarras.u5w2d2.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/examples")
public class Example {

    @GetMapping("/index")
    public String index(){
        return "funziona!";
    }

    @GetMapping("/fabios")
    public String fabios(@RequestParam String name, @RequestParam(required = false) String surname){
        System.out.println(name);
        if (surname == null) {
            return "hello " + name + " senza cognome";
        }
        return "hello " + name + " " + surname;
    }

    @GetMapping("/carlos/{id}")
    public String carlos(@PathVariable String id){
        return "Hello: " + id;
    }

    @PostMapping("/body")
    public String body(@RequestBody String body){
        return body;
    }
}
