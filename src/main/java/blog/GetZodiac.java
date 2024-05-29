package blog;

import java.time.LocalDate;
import java.util.Arrays;

public class GetZodiac {
    public String getTodayHoroscopeByUser (LocalDate date){
            int day = date.getDayOfMonth();
            int monthValue = date.getMonthValue();

            return Arrays.stream(Zodiac.values())
                    .filter(zodiac ->
                            (monthValue == zodiac.getStartMonth().getValue() && day >= zodiac.getStartDay()) ||
                            (monthValue == zodiac.getEndMonth().getValue() && day <= zodiac.getEndDay()))
                    .findFirst()
                    .map(Zodiac::getName)
                    .orElse("Неизвестный знак зодиака");
        }
    }
