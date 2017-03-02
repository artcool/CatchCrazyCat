package sinwao.com.catchcrazycat.entity;

/**
 * 描述：
 * Created by artcool on 2017/3/1.
 */

public class Dot {
     int x,y;
     int status;

    public static final int STATUS_ON = 1;
    public static final int STATUS_OFF = 0;
    public static final int STATUS_IN = 2;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
        status = STATUS_OFF;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setXY(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
