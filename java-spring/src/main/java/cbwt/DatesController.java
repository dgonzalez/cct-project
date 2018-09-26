package cbwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatesController {
    
    @RequestMapping("/api/timestamp")
    public String getTimestamp() {
        return "Fill me with code";
    }
    
    // Add another handler for /api/gmtdate
}
