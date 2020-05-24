package strategy;

/**
 * 高铁
 * 具体实现类(ConcreateStrategy)
 */
public class HighTrainStrategy implements TravelStrategy {

    @Override
    public void travelStyle() {
        System.out.println("选择高铁出行");
    }

}
