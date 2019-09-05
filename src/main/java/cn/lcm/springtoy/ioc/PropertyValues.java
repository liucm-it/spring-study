package cn.lcm.springtoy.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kermit Liu
 * @date 2019/8/5 22:00
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }
}
