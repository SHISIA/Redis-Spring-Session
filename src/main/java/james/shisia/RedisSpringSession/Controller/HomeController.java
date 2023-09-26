package james.shisia.RedisSpringSession.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    private final String HOME_VIEW_COUNT="HOME_VIEW_COUNT";
    @GetMapping("/")
    public String home(Principal principal, HttpSession session){
        incrementCount(session,HOME_VIEW_COUNT);
        return "Hello, World "+principal.getName();
    }

    private void incrementCount(HttpSession session, String attribute) {
        int homeViewCount = session.getAttribute(attribute) == null ? 0 : (Integer) session.getAttribute(attribute);
        session.setAttribute(attribute,homeViewCount+=1);
    }

    @GetMapping("/count")
    public String count(HttpSession session){
        return "HOME_VIEW_COUNT: "+session.getAttribute(HOME_VIEW_COUNT);
    }
}
