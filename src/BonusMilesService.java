public class BonusMilesService {
    public int calculate(int price) {
        int percentInKopecks = 5000;
        int miles = price / percentInKopecks;
        return miles;
    }
}
