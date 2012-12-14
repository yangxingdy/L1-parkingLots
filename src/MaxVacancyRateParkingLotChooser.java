import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yang Xing
 * Date: 12-12-14
 * Time: 下午10:51
 * To change this template use File | Settings | File Templates.
 */
public class MaxVacancyRateParkingLotChooser implements ParkingLotChooser {
    @Override
    public ParkPlace getAvailablePark(List<ParkPlace> parkPlaceList) {
        int maxVacancyRateParkIndex=0;
        int maxVacancyRate=0;
        int VacancyRate=0;
        for (int i=0; i< parkPlaceList.size(); i++){
            VacancyRate = parkPlaceList.get(i).GetAvailableNum()/parkPlaceList.get(i).GetMaxParkingNum();
            if ((VacancyRate >  maxVacancyRate)) {
                maxVacancyRateParkIndex = i;
                maxVacancyRate = VacancyRate;
            }
        }

        return parkPlaceList.get(maxVacancyRateParkIndex);
    }
}
