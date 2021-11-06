package Java.Dependency_Injection.PersonalComputerOs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonalComputerOsServiceImpl implements PersonalComputerOsService{

    private final PersonelComputerOs personelComputerOs;

    public PersonalComputerOsServiceImpl(@Qualifier("windows") PersonelComputerOs personelComputerOs) {
        this.personelComputerOs = personelComputerOs;
    }

    @Override
    public void Create() {
        personelComputerOs.Create();
    }
}
