package james.shisia.RedisSpringSession;

import james.shisia.RedisSpringSession.Config.Config;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**	The first step is to extend AbstractHttpSessionApplicationInitializer.
 * Doing so ensures that the Spring Bean by the name of springSessionRepositoryFilter is registered with our Servlet Container for every request.
 **/
public class Initializer extends AbstractHttpSessionApplicationInitializer {
    /**	AbstractHttpSessionApplicationInitializer also provides a mechanism to ensure Spring loads our Config.**/
    public Initializer() {
        super(Config.class);
    }

}