package Java.Dependency_Injection.GuitarModels;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GuitarServiceImpl implements GuitarService{

    private final Guitar guitar;

    public GuitarServiceImpl( @Qualifier("electro") Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public void Create() {
        guitar.Create();
    }
}
