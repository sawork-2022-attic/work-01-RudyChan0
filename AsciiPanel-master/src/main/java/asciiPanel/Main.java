package asciiPanel;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[]args){
        // ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        AsciiPanel asciiPanel=(AsciiPanel)context.getBean("asciiPanel");


        asciiPanel.write("A new asciiPanel");
        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
