import java.util.List;

public class PaintingService extends Service{
    PaintingRepository repository = new PaintingRepository();
    public void addPainting(String title, int year, String artist){
        if(verifyDBConnection()) {
            repository.addPainting(title, year, artist);
        }
    }
    public List<Painting> getPaintings(){
        if(verifyDBConnection()) {
            return repository.getPaintings();
        }
        return null;
    }
}
