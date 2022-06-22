package web.service;

import web.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CardaoImpl;
import web.models.Car;

import java.util.List;

@Component
public class CarserviceImpl implements CarDao {
    private CardaoImpl cardaoImlp;
    @Autowired
    public CarserviceImpl(CardaoImpl cardaoImlp) {
        this.cardaoImlp = cardaoImlp;
    }
    @Override
    public List<Car> getCars(int  count){
        return cardaoImlp.getCars(count);
    }

}
