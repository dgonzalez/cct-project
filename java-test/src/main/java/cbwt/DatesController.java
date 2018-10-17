package cbwt;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatesController {
    
    @RequestMapping("/api/timestamp")
    public long getTimestamp() {
    	Date date = new Date();
    	return date.getTime();
    }
    @RequestMapping("/api/gmtdate")
    public String getGmt() {
        return new Date().toGMTString();
    }
    
    // Add another handler for /api/gmtdate
}

