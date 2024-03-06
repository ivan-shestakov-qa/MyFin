import lombok.*;

@AllArgsConstructor
@Getter
public enum Sityes {
    BREST("brest"),
    VITEBSK("vitebsk"),
    GOMEL("gomel"),
    GRODNO("grodno"),
    MINSK("minsk"),
    MOGILEV("mogilev");

    private final String sity;
}
