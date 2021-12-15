package pl.adam.hotelsapplication.remote.rest.dto.response;

import pl.adam.hotelsapplication.domain.model.ReservationStatusType;
import pl.adam.hotelsapplication.remote.rest.dto.request.HotelReservationDto;
import pl.adam.hotelsapplication.remote.rest.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private PersonReservationDto person;
    private List<HotelReservationDto> hotels;
}
