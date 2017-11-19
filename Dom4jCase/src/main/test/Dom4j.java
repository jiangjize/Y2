import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by lenovo on 2017/10/23.
 */
public class Dom4j {
    @Test
    public  void dom4jTest1() throws DocumentException {
        Document doc = null;
        //加载dom树
        SAXReader reader = new SAXReader();
 /*       doc = reader.read("E:\\Y2\\Dom4jCase\\src\\Book.xml");*/
        doc = reader.read("src/Book.xml");
        //获取根节点
        Element root = doc.getRootElement();
        Iterator itBooks = root.elementIterator();
        while (itBooks.hasNext()) {
            Element bookEle = (Element) itBooks.next();
            String bookname = bookEle.attributeValue("name");
            System.out.println("书名：" + bookname);
            Iterator itauthor=bookEle.elementIterator();
             while (itauthor.hasNext()){
                 Element authorEle= (Element) itauthor.next();
                 String authorname=authorEle.attributeValue("name");
                 System.out.println("作者："+authorname);
               Iterator itprice=  authorEle.elementIterator();
                 while (itprice.hasNext()){
                     Element priceEle= (Element) itprice.next();
                    String pricename= priceEle.attributeValue("name");
                     System.out.println("价格："+pricename);
                 }
             }
        }
    }
    @Test
    public  void dom4jTest2() throws DocumentException {
        Document doc=null;
        //加载dom树
        SAXReader saxReader=new SAXReader();
        doc=saxReader.read("src/Phone.xml");
        //获取根元素（根节点）
        Iterator itphones= (Iterator) doc.getRootElement().elementIterator();
        //循环遍历出根节点下的所有子节点
        while (itphones.hasNext()){
            Element phoneEle= (Element) itphones.next();
            String phonename=phoneEle.attributeValue("name");
            System.out.println("手机品牌："+phonename);
            System.out.println();
           Iterator ittype= phoneEle.elementIterator();
           while (ittype.hasNext()){
              Element typeEle= (Element) ittype.next();
              String typename=typeEle.attributeValue("name");
               String typepr=typeEle.attributeValue("pr");
               System.out.println("版本类型："+typename);
               if (typepr!=null)
                   System.out.println("价格："+typepr);
           }
        }

    }
}
