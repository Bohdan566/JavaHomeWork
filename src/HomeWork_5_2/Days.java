package HomeWork_5_2;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public enum Days {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String day;

}
