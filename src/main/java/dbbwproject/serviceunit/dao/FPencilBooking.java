package dbbwproject.serviceunit.dao;

import dbbwproject.serviceunit.dto.PencilBookingStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FPencilBooking {
    public static final String key = "pencil-bookings";
    public static final String TRIP_SEASON_INDEX = "tripSeasonIndex";
    private String seasonCode;
    private String tripCode;
    private String personName;
    private String tpNo;
    private int seatCount;
    private String registrationNumbers;
    private long meetUpDate;
    private PencilBookingStatus pencilBookingStatus;
    private String tripSeasonIndex;//combination of seasonCode_tripCode for indexing
}
