package Service;

import DAO.PaintingRepository;
import Model.Painting;

import java.util.List;

public class PaintingService{
    PaintingRepository repository = new PaintingRepository();
    public void addPainting(String title, int year, String artist){
            repository.addPainting(new Painting(title, year,artist));

    }
    public List<Painting> getPaintings(){
            return repository.getPaintings();
    }
}
