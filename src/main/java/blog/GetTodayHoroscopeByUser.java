package blog;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.time.LocalDate;

public class GetTodayHoroscopeByUser {
    public String getTodayHoroscopeByUser(LocalDate birthdayDate) throws IOException {
        GetZodiac getZodiac = new GetZodiac();
        String zodiacName = getZodiac.getTodayHoroscopeByUser(birthdayDate);
        String url = "https://horo.mail.ru/prediction/"+zodiacName+"/today/";
        Document document = Jsoup.connect(url).get();
        Elements contentElem = document.select("p");
        String result = contentElem.toString().replaceAll("<p>|</p>", "");
        return result;
    }
}
