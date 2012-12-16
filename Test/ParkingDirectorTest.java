import org.junit.Test;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Yang Xing
 * Date: 12-12-16
 * Time: 下午3:08
 * To change this template use File | Settings | File Templates.
 */
public class ParkingDirectorTest {
    @Test
    public void parkingDirector_ShouldShowParkingLotInfo(){
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();

        int maxParkingNum1 = 10;
        int maxParkingNum2 = 10;
        int maxParkingNum3 = 10;
        int maxParkingNum4 = 10;
        int maxParkingNum5 = 10;
        int maxParkingNum6 = 10;
        int maxParkingNum7 = 20;

        ParkPlace parPlace1 = new ParkPlace(maxParkingNum1, 1);
        ParkPlace parPlace2 = new ParkPlace(maxParkingNum2, 2);
        ParkPlace parPlace3 = new ParkPlace(maxParkingNum3, 3);
        ParkPlace parPlace4 = new ParkPlace(maxParkingNum4, 4);
        ParkPlace parPlace5 = new ParkPlace(maxParkingNum5, 5);
        ParkPlace parPlace6 = new ParkPlace(maxParkingNum6, 6);
        ParkPlace parPlace7 = new ParkPlace(maxParkingNum7, 7);

        ArrayList<ParkPlace> parkPlaces1 =new ArrayList<ParkPlace>();
        parkPlaces1.add(parPlace1);
        parkPlaces1.add(parPlace2);

        ArrayList<ParkPlace> parkPlaces2 =new ArrayList<ParkPlace>();
        parkPlaces2.add(parPlace3);
        parkPlaces2.add(parPlace4);

        ArrayList<ParkPlace> parkPlaces3 =new ArrayList<ParkPlace>();
        parkPlaces3.add(parPlace5);
        parkPlaces3.add(parPlace6);

        ArrayList<ParkPlace> managerParkPlaces =new ArrayList<ParkPlace>();
        managerParkPlaces.add(parPlace7);

        ParkingBoy parkingBoy =new ParkingBoy(parkPlaces1, new FirstAvailableParkingLotChooser());
        ParkingBoy smartParkingBoy =new ParkingBoy(parkPlaces2, new MaxAvailableParkingLotChooser());
        ParkingBoy superParkingBoy =new ParkingBoy(parkPlaces3, new MaxVacancyRateParkingLotChooser());

        ArrayList<ParkingBoy> parkingBoys =new ArrayList<ParkingBoy>();
        parkingBoys.add(parkingBoy);
        parkingBoys.add(smartParkingBoy);
        parkingBoys.add(superParkingBoy);

        ParkingManager parkingManager =new ParkingManager(managerParkPlaces,parkingBoys, new RandomParkingLotChooser());
        ArrayList<ParkingManager> parkingManagers =new ArrayList<ParkingManager>();
        parkingManagers.add(parkingManager);

        ParkingDirector parkingDirector =new ParkingDirector(parkingManagers);

        Ticket ticket1 = parkingBoy.parking(car1);
        Ticket ticket2 = smartParkingBoy.parking(car2);
        Ticket ticket3 = smartParkingBoy.parking(car3);
        Ticket ticket4 = superParkingBoy.parking(car4);
        Ticket ticket5 = parkingManager.parking(car5);

        parkingDirector.ShowParkingLotInfoFromDirector();
    }
}
