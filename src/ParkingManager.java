import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Yang Xing
 * Date: 12-12-14
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */
public class ParkingManager extends ParkingBoy{
    private ArrayList<ParkingBoy> parkingBoys;
    public int iTotalAvailableNum;
    public int iTotalParkedNum;

    public ParkingManager(ArrayList<ParkPlace> parkPlaces,ArrayList<ParkingBoy> parkingBoys, ParkingLotChooser parkingLotChooser) {
        super(parkPlaces, parkingLotChooser);
        this.parkingBoys = parkingBoys;
    }
    public ParkingBoy GetParkingBoy(int parkingBoyIndex)
    {
          return parkingBoys.get(parkingBoyIndex);
    }
    public void ShowParkingLotInfoFromManagedParkingBoy()
    {
        for (int i=0; i< parkingBoys.size(); i++)
        {
            System.out.println("停车仔编号:" + i);
            parkingBoys.get(i).ShowParkingLotInfoFromParkingBoy();
            iTotalAvailableNum += parkingBoys.get(i).GetAvailableNum();
            iTotalParkedNum += parkingBoys.get(i).GetParkedNum();
        }
    }

    public void ShowParkingLotInfoFromManagerSelf()
    {
        for (int i=0; i< parkPlaces.size(); i++)
        {
            parkPlaces.get(i).ShowParkPlaceInfo(false);
            iTotalAvailableNum += parkPlaces.get(i).GetAvailableNum();
            iTotalParkedNum += parkPlaces.get(i).GetParkedNum();
        }
    }

}
