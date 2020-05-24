package strategy;

/**
 * 飞机
 * 具体实现类(ConcreateStrategy)
 */
public class PlaneStrategy implements TravelStrategy {

    @Override
    public void travelStyle() {
        System.out.println("选择飞机出行");
    }

}
