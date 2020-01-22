package rock.vo;

/**
 * @ClassName Cat
 * @Description little cat
 * @Author alan
 * @Date 2019/12/25 14:50
 * @Version todo
 **/
public class Cat extends Animal {

    String name;

    String sex;

    Boolean cute;

    public Boolean getCute() {
        return cute;
    }

    public void setCute(Boolean cute) {
        this.cute = cute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
