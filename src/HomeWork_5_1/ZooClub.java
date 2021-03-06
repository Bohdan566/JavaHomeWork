package HomeWork_5_1;


import lombok.*;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ZooClub {

    private Map<Person, List<Pet>> club;
}
