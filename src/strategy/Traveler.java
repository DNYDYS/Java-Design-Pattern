package strategy;

/**
 * 游客
 * 环境类(Context)
 */
public class Traveler {

    // 出行策略接口
    TravelStrategy travelStrategy;

    // 设置出行策略
    public void setTravelStrategy(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;
    }

    // 为当前用户设置出行方式
    public void travelStyle(){
        travelStrategy.travelStyle();
    }

    public static void main(String[] args) {

        Traveler traveler = new Traveler();

        // 设置出行方法
        traveler.setTravelStrategy(new TrainStrategy());

        // 游客出行
        traveler.travelStyle();

    }

}
