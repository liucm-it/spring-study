package cn.lcm.springtoy.ioc;

/**
 * @author Kermit Liu
 * @date 2019/8/5 22:03
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
