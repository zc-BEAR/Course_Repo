import javafx.beans.property.SimpleStringProperty;

public class Schedule {
    private final SimpleStringProperty station_name , train_id , arrive_time , leave_time , date;

    public Schedule(String station_name , String train_id , String arrive_time , String leave_time , String date){
        this.date = new SimpleStringProperty(date);
        this.leave_time = new SimpleStringProperty(leave_time);
        this.arrive_time = new SimpleStringProperty(arrive_time);
        this.station_name = new SimpleStringProperty(station_name);
        this.train_id = new SimpleStringProperty(train_id);
    }

    public void setStation_name(String station_name){
        this.station_name.set(station_name);
    }

    public void setTrain_id(String train_id){
        this.train_id.set(train_id);
    }

    public void setArrive_time(String arrive_time){
        this.arrive_time.set(arrive_time);
    }

    public void setLeave_time(String leave_time){
        this.leave_time.set(leave_time);
    }

    public void setDate(String date){
        this.date.set(date);
    }

    public String getArrive_time() {
        return arrive_time.get();
    }

    public String getDate() {
        return date.get();
    }

    public String getLeave_time() {
        return leave_time.get();
    }

    public String getTrain_id() {
        return train_id.get();
    }

    public String getStation_name() {
        return station_name.get();
    }
}
