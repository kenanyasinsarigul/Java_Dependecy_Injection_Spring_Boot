package Java.Dependency_Injection.PersonalComputerOs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personalComputerOs")
public class PersonalComputerOsController {

    private final PersonalComputerOsService personalComputerOsService;

    public PersonalComputerOsController(PersonalComputerOsService personalComputerOsService) {
        this.personalComputerOsService = personalComputerOsService;
    }

    @GetMapping("/create")
    public void Create(){
        personalComputerOsService.Create();
    }
}
