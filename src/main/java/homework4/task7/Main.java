package homework4.task7;
import java.util.ArrayList;
import java.util.List;
//Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
public class Main {
    public static void main(String[] args) {
Park park = new Park();
park.addAttraction("Spring horse", "12-16" , 10);
park.addAttraction("Slide", "12-16", 15);
        park.printAttractionsInfo();
    }
}
