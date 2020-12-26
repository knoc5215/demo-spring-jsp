package me.jumen.demospringjsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class EventController {


    @GetMapping("/events")
    public String getEvents(Model model) {
        Event event1 = new Event();
        event1.setName("spring mvc web study 1");
        event1.setStart(LocalDateTime.of(2020, 1, 15, 10, 1));

        Event event2 = new Event();
        event2.setName("spring mvc web study 2");
        event2.setStart(LocalDateTime.of(2021, 1, 15, 10, 1));

        List<Event> events = List.of(event1, event2);
        model.addAttribute("events", events);
        model.addAttribute("message", "Happy new year ! ");
        return "events/list";
    }
}
