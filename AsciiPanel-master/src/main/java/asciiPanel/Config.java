package asciiPanel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    public AsciiPanel asciiPanel(){
        return new AsciiPanel();
    }

    @Bean 
    public AsciiFont asciiFont(){
        return new AsciiFont();
    }

    @Bean
    public int width(){
        return 10;
    }

    @Bean
    public int height(){
        return 10;
    }

    @Bean 
    public String fontFilename(){
        return "drake_10x10.png";
    }
}
