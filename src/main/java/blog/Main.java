package blog;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate localDate = LocalDate.of(2000,12,1);
        GetTodayHoroscopeByUser getTodayHoroscopeByUser = new GetTodayHoroscopeByUser();
        System.out.println(getTodayHoroscopeByUser.getTodayHoroscopeByUser(localDate));
    }
}