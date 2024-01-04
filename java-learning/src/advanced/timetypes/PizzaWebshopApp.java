package advanced.timetypes;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PizzaWebshopApp {

    public static void main(String[] args) {
        LocalTime openingHour = LocalTime.of(11, 0);
        LocalTime closingTime = LocalTime.of(22, 0);
        System.out.printf("The restaurant is open from %s to %s on every day\n", openingHour, closingTime);

        LocalDate orderDate = LocalDate.now().minusDays(5);
        System.out.printf("The pizza was ordered on %s\n", orderDate);

        LocalDateTime  orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.printf("I submitted the order: %s\n", orderDateTime);

        LocalTime deliveryTime = LocalTime.of(1, 10);
        System.out.printf("Delivery time: %s\n", deliveryTime);

        LocalDateTime estimatedDeliveryDateTime = orderDateTime.plusHours(deliveryTime.getHour()).plusMinutes(deliveryTime.getMinute());
        System.out.printf("The estimated delivery time: %s\n", estimatedDeliveryDateTime);

        LocalDateTime realDeliveryDateTime = orderDateTime.plusMinutes(90);
        System.out.printf("The real delivery time was: %s\n", realDeliveryDateTime);

        long differenceBetweenEstimatedAndReal = ChronoUnit.MINUTES.between(estimatedDeliveryDateTime, realDeliveryDateTime);
        System.out.printf("Difference: %s in minutes\n", differenceBetweenEstimatedAndReal);

        if(estimatedDeliveryDateTime.isBefore(realDeliveryDateTime)){
            System.out.println("The pizza didn't arrive in time\n");
        } else {
            System.out.println("The pizza arrived in time\n");
        }

        HijrahDate hijrahDate = HijrahDate.from(orderDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        System.out.printf("Based on Hijrah calendar I ordered my pizza on: %s\n", hijrahDate);

        ZonedDateTime myLocalDateTime = orderDateTime.atZone(ZoneId.of("Europe/Budapest"));
        System.out.printf("The time I ordered pizza was %s in Budapest.\n", myLocalDateTime);

        ZonedDateTime tokioDateTime = myLocalDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.printf("The time I ordered pizza was %s in Tokyo.\n", tokioDateTime);

        for(String zoneId: ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }
    }
}
