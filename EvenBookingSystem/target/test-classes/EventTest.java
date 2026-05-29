import org.junit.jupiter.api.Test;
import com.keyin.Event;
import static org.junit.jupiter.api.Assertions.*;

public class EventTest {

    @Test
    void testEventName() {
        Event event = new Event("Summer Festival Concert", 1);
        assertEquals("Summer Festival Concert", event.getEventName());
    };

    @Test
    void testCapacityLimit(){
        Event event = new Event("Event Test", 2);

        event.registerAttendee("Joey");
        event.registerAttendee("Minnie");
        
        String result = event.registerAttendee("Karen");

        assertEquals("The Event is full. Cannot register - Karen.", result);
    };

    @Test 
    void testEventCapacity(){
        Event event = new Event ("Event Test", 1);
        assertEquals(1, event.getCapacity());

    };

    @Test 
    void testRegisterAttendee(){
        Event event = new Event("Event Test", 2);

        String result = event.registerAttendee("Joey");
        assertEquals("Attendee Joey registered successfully.", result);
        assertTrue(event.getAttendees().contains("Joey"));
    };

    @Test
    void testcancelRegistration(){
        Event event = new Event("Event Test", 2);

        event.registerAttendee("Jannice");
        String result = event.cancelRegistration("Jannice");
        assertEquals("Event Test Registration cancelled.", result);
        assertFalse(event.getAttendees().contains("Jannice"));
    };
}
