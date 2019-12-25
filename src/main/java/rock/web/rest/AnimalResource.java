package rock.web.rest;

import org.springframework.web.bind.annotation.RestController;
import rock.vo.Cat;
import rock.vo.Things;

/**
 * @ClassName AnimalResource
 * @Description todo
 * @Author alan
 * @Date 2019/12/25 14:58
 * @Version todo
 **/
@RestController
public class AnimalResource {



    public void getCatName() {
        Things T = new Things();
        Cat cat = new Cat();

        cat.getA();

    }

}
