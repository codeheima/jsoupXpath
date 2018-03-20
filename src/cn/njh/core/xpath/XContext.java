package cn.njh.core.xpath;

import java.util.LinkedList;

import cn.njh.core.model.Node;

/**
 * @author github.com/zhegexiaohuozi [seimimaster@gmail.com]
 * @since 14-3-10
 */
public class XContext {
    public LinkedList<Node> xpathTr;
    public XContext(){
        if (xpathTr==null){
            xpathTr = new LinkedList<Node>();
        }
    }
}