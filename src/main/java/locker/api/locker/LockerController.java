package locker.api.locker;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LockerController {
    private static final String FIND = "/find";

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(FIND)
    public List<Lockers> getAllLocker(){
        return   List.of(
            new Lockers(1L, "workers locker 1", "ikeja", "90,000", "big and spacious", "lagos"),

            new Lockers(2L, "plastic bedside locker", "ikeja", "85,000", "big and spacious", "lagos"),

            new Lockers(3L, "qaulity workers", "lekki", "60,000", "big and spacious", "porthacourt"),

            new Lockers(4L, "12 Doors steel Staff Clothing Locker",  "Lagos", "10,000", "big and spacious", "abuja"),

            new Lockers(5L, "2 Doors Worker Lockers", "abule-egba", "40,000", "big and spacious", "lagos"),

            new Lockers(6L, "qaulity workers", "ikorodu", "20,000", "big and spacious", "ibadan"),

            new Lockers(7L, "12 Doors steel Staff Clothing Locker",  "Lagos", "50,000", "big and spacious", "ekiti"),

            new Lockers(8L, "2 Doors Worker Lockers", "Somolu", "40,000", "big and spacious", "ibadan")
        );
     }
}




