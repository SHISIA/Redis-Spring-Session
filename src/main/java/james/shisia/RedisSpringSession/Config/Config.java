package james.shisia.RedisSpringSession.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration(proxyBeanMethods = false)
@EnableRedisHttpSession
/**	The @EnableRedisHttpSession annotation creates a Spring Bean with the name of springSessionRepositoryFilter that implements Filter.
 *  The filter is in charge of replacing the HttpSession implementation to be backed by Spring Session.
 *  In this instance, Spring Session is backed by Redis
 *  **/
public class Config {

    @Bean
    public LettuceConnectionFactory connectionFactory() {
        return new LettuceConnectionFactory();
    }
}
