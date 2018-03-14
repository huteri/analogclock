package me.huteri.analogclock;

import android.graphics.Path;
import android.graphics.Region;

import java.util.Date;

/**
 * Created by huteri on 24/10/2017.
 */

public class ArcSlice {

    private Date startTime, endTime;
    private Region region;
    private Path path;
    private int color;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
