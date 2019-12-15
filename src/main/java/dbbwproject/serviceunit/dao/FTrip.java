package dbbwproject.serviceunit.dao;

import dbbwproject.serviceunit.dto.TripStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FTrip {
    public static final String key = "trips";
    private String code;
    private String seasonCode;
    private int perPersonCost;
    private long startDate;
    private long endDate;
    private long ppColDate;
    private int passengerCount;
    private TripStatus tripStatus;
}
