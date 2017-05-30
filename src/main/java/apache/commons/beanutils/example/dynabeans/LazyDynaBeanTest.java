/*
 * File Name: LazyDynaBean.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.dynabeans;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.LazyDynaBean;

import apache.commons.beanutils.example.pojo.User;

/**
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月30日
 */

public class LazyDynaBeanTest
{

    public static void main(String[] args)
    {
        DynaBean dynaBean = new LazyDynaBean();

        dynaBean.set("foo", "bar");                   // simple

        dynaBean.set("customer", "title", "Mr");      // mapped
        dynaBean.set("customer", "surname", "Smith"); // mapped

        dynaBean.set("users", 0, new User());     // indexed
        dynaBean.set("users", 1, new User());     // indexed
        dynaBean.set("users", 2, new User());     // indexed
        
        System.out.println(dynaBean.get("customer", "title"));
    }
}
