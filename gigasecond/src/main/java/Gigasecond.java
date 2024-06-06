import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime.plusSeconds(1_000_000_000);
    }
}
