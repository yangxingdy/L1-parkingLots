import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-12-2
 * Time: 下午4:11
 * To change this template use File | Settings | File Templates.
 */
public class FirstAvailableParkingLotChooser implements ParkingLotChooser{
    @Override
    public ParkPlace getAvailablePark(List<ParkPlace> parkPlaceList) {
        for(ParkPlace parkPlace:parkPlaceList){
            if(parkPlace.GetAvailableNum()>0) return parkPlace;
        }
       return null;
    }
}
