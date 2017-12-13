package rusmlg.Other;

import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);

    public Event(int id, String msg, Date date) {
        this.id = id;
        this.msg = msg;
        this.date = date;
    }

    public Event(Date date, DateFormat dateFormat){
        this.id = AUTO_ID.getAndIncrement();
        this.date = date;
        this.dateFormat = dateFormat;

    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
