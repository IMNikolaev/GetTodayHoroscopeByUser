package blog;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Month;

@AllArgsConstructor
@Getter
public enum Zodiac {
    CAPRICORN("capricorn","Козерог", Month.DECEMBER, 22, Month.JANUARY, 19),
    AQUARIUS("aquarius","Водолей", Month.JANUARY, 20, Month.FEBRUARY, 18),
    PISCES("pisces","Рыбы", Month.FEBRUARY, 19, Month.MARCH, 20),
    ARIES("aries","Овен", Month.MARCH, 21, Month.APRIL, 19),
    TAURUS("taurus","Телец", Month.APRIL, 20, Month.MAY, 20),
    GEMINI("gemini","Близнецы", Month.MAY, 21, Month.JUNE, 20),
    CANCER("cancer","Рак", Month.JUNE, 21, Month.JULY, 22),
    LEO("leo","Лев", Month.JULY, 23, Month.AUGUST, 22),
    VIRGO("virgo","Дева", Month.AUGUST, 23, Month.SEPTEMBER, 22),
    LIBRA("libra","Весы", Month.SEPTEMBER, 23, Month.OCTOBER, 22),
    SCORPIO("scorpio","Скорпион", Month.OCTOBER, 23, Month.NOVEMBER, 21),
    SAGITTARIUS("sagittarius","Стрелец", Month.NOVEMBER, 22, Month.DECEMBER, 21);

    private final String name;
    private final String ruName;
    private final Month startMonth;
    private final int startDay;
    private final Month endMonth;
    private final int endDay;

}