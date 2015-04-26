package id.co.technomotion.builderpatteronandroid;

import junit.framework.Assert;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by omayib on 4/17/15.
 */
public class PersonTest {
    @Test
    public void should_throw_error_if_person_not_contain_first_name(){
        Person p=new Person.Builder().address("alamat")
                .birthDay("12")
                .birthPlace("solo")
                .bodyHeight(120)
                .bodyWedight(70)
                .job("pekerjaan")
                .lastName("huda")
                .middleName("midle name")
                .phone("2232323")
                .firstName("ariff")
                .salary("23000000000").build();
        System.out.println(p.toString());
        Assert.assertEquals("arif",p.getFirstName());
    }
}
