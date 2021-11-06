package Java.Dependency_Injection.Common;

import Java.Dependency_Injection.GuitarModels.AcousticGuitarImpl;
import Java.Dependency_Injection.GuitarModels.ElectroGuitarImpl;
import Java.Dependency_Injection.GuitarModels.Guitar;
import Java.Dependency_Injection.PersonalComputerOs.PersonalComputerMacOsImpl;
import Java.Dependency_Injection.PersonalComputerOs.PersonalComputerWindowsOsImpl;
import Java.Dependency_Injection.PersonalComputerOs.PersonelComputerOs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Primary
    @Bean
    public Guitar acoustic(){
        return new AcousticGuitarImpl();
    }

    @Bean
    public Guitar electro(){
        return new ElectroGuitarImpl();
    }

    @Bean
    public PersonelComputerOs windows(){
        return new PersonalComputerWindowsOsImpl();
    }

    @Bean
    public PersonelComputerOs mac(){
        return new PersonalComputerMacOsImpl();
    }
}
