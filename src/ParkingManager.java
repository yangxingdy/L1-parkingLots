import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Yang Xing
 * Date: 12-12-14
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */
public class ParkingManager extends ParkingBoy{
    private ArrayList<ParkPlace> parkingBoy;

    public ParkingManager(ArrayList<ParkPlace> parkPlaces, ParkingLotChooser parkingLotChooser) {
        super(parkPlaces, parkingLotChooser);
    }
}
