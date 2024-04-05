import java.time.*;

class MyData{
    private LocalDate date;


    MyData(int year , int month , int day){
        this.date = LocalDate.of(year, month, month);
    }
    public int getYear(){
        return date.getYear();
    }
}
public class MasterLocalDate {
    
}
