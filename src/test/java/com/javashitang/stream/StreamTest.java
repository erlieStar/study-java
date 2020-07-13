package com.javashitang.stream;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lilimin
 * @since 2020-07-13
 */
public class StreamTest {

    @Test
    public void filter() {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4);
        List<Integer> tempList1 = list.stream().filter(s -> {return true;}).collect(Collectors.toList());
        List<Integer> tempList2 = list.stream().filter(s -> {return false;}).collect(Collectors.toList());
        System.out.println(tempList1.size());
        System.out.println(tempList2.size());
        Assert.assertEquals(tempList1.size(), 4);
        Assert.assertEquals(tempList2.size(), 0);
    }
}