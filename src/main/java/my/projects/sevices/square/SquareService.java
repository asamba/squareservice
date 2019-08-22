package my.projects.sevices.square;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by P5104488 on 8/21/2019.
 */
@RestController
@RequestMapping("/api")
public class SquareService {

    @GetMapping("/square")
    public String getSquare(){
        return "Square";
    }
}
