import java.util.List;
import java.util.Random;
/* Date: 12-12-15
 * Time: 上午12:11
 * To change this template use File | Settings | File Templates.
 */
public class RandomParkingLotChooser implements ParkingLotChooser {
    @Override
    public ParkPlace getAvailablePark(List<ParkPlace> parkPlaceList) {
        Boolean bHaveAvailablePark = false;
        for(ParkPlace parkPlace:parkPlaceList){
            if(parkPlace.GetAvailableNum()>0)
            {
                bHaveAvailablePark =true;
            }
        }
        if (true != bHaveAvailablePark)
        {
            return null;
        }
        Random rnd = new Random();
        return parkPlaceList.get(rnd.nextInt(parkPlaceList.size()));
    }
}
