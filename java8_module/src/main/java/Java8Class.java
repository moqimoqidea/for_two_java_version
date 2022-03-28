import javax.annotation.PostConstruct;

/**
 * @author moqi
 * @date 2022/3/28 17:57
 */
public class Java8Class {

    @PostConstruct
    public void init() {
        System.out.println("Java8Class init");
    }

}
