package com.juno.reservations.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomReservationWebController {

    @RequestMapping(value = "/reservation")
    public String index() {
        return "index";
    }
}
