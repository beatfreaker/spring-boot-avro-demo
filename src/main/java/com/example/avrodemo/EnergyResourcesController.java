package com.example.avrodemo;

import avro.BatteryEvent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
public class EnergyResourcesController {
    private final Date date = new Date();

    @PostMapping("/event/{uuid}")
    BatteryEvent postBatteryEvent(
            @PathVariable("uuid") String uuid,
            @RequestBody BatteryEvent batteryEvent) throws IOException {
        batteryEvent.setTime(date.getTime());
        return batteryEvent;
    }
}
