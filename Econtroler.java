package net.javaguides.employeespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/employee")

public class Econtroler {
    @Autowired
    private repository EmploRepository;
    @GetMapping
    public List<employee> getAllEmployees(){
        return EmploRepository.findAll();

    }
    @PostMapping

    public employee createEmployees(@RequestBody employee Employee){
        return EmploRepository.save(Employee);
    }


}
