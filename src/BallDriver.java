import java.util.ArrayList;

public class BallDriver {
    public static void main(String[] args) {
        var balls = new ArrayList<Ball>();
        var football = new Football();
        var futbol = new SoccerBall();

        balls.add(football);
        balls.add(futbol);

        for (Ball b : balls){
            System.out.println(b.action());
        }
    }
}
