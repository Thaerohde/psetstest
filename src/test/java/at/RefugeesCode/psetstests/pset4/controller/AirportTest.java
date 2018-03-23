package at.RefugeesCode.psetstests.pset4.controller;

import at.RefugeesCode.psetstests.pset4.model.Luggage;
import at.RefugeesCode.psetstests.pset4.util.TimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

class AirportTest {
    private Airport airport = new Airport();
    private Luggage luggage = new Luggage();
    private SecurityControl securityControl = new SecurityControl();


    @Test
    void testLuggageIsRejected() {
        // create one luggage that will arrive too late
        //Mohammad Alsakini;Berlin;Baggage;18:16;18:30;2
        //Owner;Destination;Type;Drop Off Time;Departure Time;Flight Duration


        luggage.setOwner("Mohammad Alsakini");
        luggage.setDestination("");
    }

    @Test
    void testLuggageArrived() {
        luggage.setWaitingDuration(Duration.ofMinutes(0));
        luggage.setOwner("thaer");
        luggage.setDestination("Berlin");
        luggage.setDropOffTime(TimeUtils.todayAt("18:16"));
        luggage.setFlightDuration(TimeUtils.durationOfHours("2"));
        luggage.setDepartureTime(TimeUtils.todayAt("18:30"));
        luggage.setType("Baggage");

        Assertions.assertEquals(luggage.getWaitingDuration(), "");
        List<Luggage> travellist = new ArrayList<>();
        travellist.add(luggage);
        rejected securityControl.getRejectedLuggage();


    }

    // create one luggage that will be accepted


    // test that the duration and arrival times are correct


}
