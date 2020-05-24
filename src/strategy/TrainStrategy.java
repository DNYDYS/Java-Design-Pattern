package strategy;

/**
 * 火车
 * 具体实现类(ConcreateStrategy)
 */
public class TrainStrategy implements TravelStrategy {

    @Override
    public void travelStyle() {
        System.out.println("选择火车出行");
    }

}
