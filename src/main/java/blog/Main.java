package blog;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate localDate = LocalDate.of(2002,04,15);
        GetTodayHoroscopeByUser getTodayHoroscopeByUser = new GetTodayHoroscopeByUser();
        GetZodiac getZodiac = new GetZodiac();
        System.out.println(getZodiac.getTodayHoroscopeByUser(localDate));
        System.out.println(getTodayHoroscopeByUser.getTodayHoroscopeByUser(localDate));
    }
}