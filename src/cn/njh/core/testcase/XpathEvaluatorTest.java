package cn.njh.core.testcase;


import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cn.njh.core.model.Node;
import cn.njh.core.xpath.XpathEvaluator;


import java.util.List;

/**
 * XpathEvaluator Tester.
 *
 * @author <et.tw@163.com>
 * @version 1.0
 */
public class XpathEvaluatorTest {
    private XpathEvaluator underTest;
    @Before
    public void before() throws Exception {
        underTest = new XpathEvaluator();
    }

    /**
     * Method: getXpathNodeTree(String xpath)
     */
    @Test
    public void testGetXpathNodeTree() throws Exception {
        List<Node> nodes = underTest.getXpathNodeTree("//meta[@charset]");
        Assert.assertTrue(StringUtils.isBlank(nodes.get(0).getPredicate().getLeft()));
    }

    @Test
    public void testXpathNodeTree(){
        List<Node> nodes = underTest.getXpathNodeTree("//meta[@charset!~'xx']/@href");
        System.out.println(nodes);
    }
}