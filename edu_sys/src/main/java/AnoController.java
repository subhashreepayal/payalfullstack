import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnoController {

    @GetMapping("/")
    public static String index() {
        return "index";
    }
}
