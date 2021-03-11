package HomeWork_5_2;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Movie {

    private String title;
    private Time duration;

    @Override
    public String toString() {
        return "Title movie: " + '"' +  title + '"' + ", duration time: " + duration;
    }
}
