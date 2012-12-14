import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-25
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public class ParkingBoy {
    private ArrayList<ParkPlace> parkPlaces;
    private final ParkingLotChooser parkingLotChooser;
    public ParkingBoy(ArrayList<ParkPlace> parkPlaces, ParkingLotChooser parkingLotChooser) {
        //To change body of created methods use File | Settings | File Templates.
        this.parkPlaces =  parkPlaces;
        this.parkingLotChooser = parkingLotChooser;
    }

    public Ticket parking(Car car) {

        return parkingLotChooser.getAvailablePark(parkPlaces).parking(car);
        /*if (true != smartBoy){
            for (int i=0; i< parkPlaces.size(); i++){
                if (parkPlaces.get(i).GetAvailableNum() > 0) {
                    return parkPlaces.get(i).parking(car);
                }
            }
        }
        else{
            int maxAvailableNum=0;
            int maxAvailableParkIndex=0;
            for (int i=0; i< parkPlaces.size(); i++){
                if (parkPlaces.get(i).GetAvailableNum() >  maxAvailableNum) {
                    maxAvailableParkIndex = i;
                    maxAvailableNum = parkPlaces.get(i).GetAvailableNum();
                }
            }

            return parkPlaces.get(maxAvailableParkIndex).parking(car);
        }
        return null;*/
    }

    public Car GetParkedCar(Ticket ticket) {

        for (int i=0; i< parkPlaces.size(); i++){
                return parkPlaces.get(i).GetParkedCar(ticket);
        }
        return null;
    }
}
