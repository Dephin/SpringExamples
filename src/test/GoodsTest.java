import dao.GoodsDAO;
import entity.Goods;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class GoodsTest {
    private SqlSession session;

    public GoodsTest() {
        session = MyBatisUtil.getSession();
    }

    @Test
    public void getGoodsPagerTest() {
        int skip = 4;
        int size = 2;
        try {
            GoodsDAO bookDao = session.getMapper(GoodsDAO.class);
            List<Goods> goods = bookDao.getGoodsPager(skip, size);
            System.out.println(goods);
        } finally {
            session.close();
        }
    }

    @Test
    public void getGoodsByIdTest() {
        try {
            GoodsDAO bookDao = session.getMapper(GoodsDAO.class);
            Goods goods = bookDao.getGoodsById(1);
            System.out.println(goods);
        } finally {
            session.close();
        }
    }

    @Test
    public void getGoodsCountTest() {
        try {
            GoodsDAO bookdao = session.getMapper(GoodsDAO.class);
            int result = bookdao.getGoodsCount();
            System.out.println(result);
        } finally {
            session.close();
        }
    }

    @Test
    public void insertTest() {
        try {
            Goods entity = new Goods();
            entity.setName("正宗无锡阳山水蜜桃新鲜水果水密桃12个6斤装江浙沪皖顺丰包邮");
            entity.setPrice(108);
            entity.setPicture("nopic.jpg");
            GoodsDAO bookdao = session.getMapper(GoodsDAO.class);
            int resutl = bookdao.insert(entity);
            System.out.println(resutl);
        } finally {
            session.close();
        }
    }

    @Test
    public void deleteTest() {
        try {
            GoodsDAO bookdao = session.getMapper(GoodsDAO.class);
            int result = bookdao.delete(12);
            System.out.println(result);
        } finally {
            session.close();
        }
    }

    @Test
    public void update() {
        try {
            GoodsDAO bookdao = session.getMapper(GoodsDAO.class);
            Goods entity = bookdao.getGoodsById(12);
            entity.setName("正宗无锡阳山水蜜桃新鲜水果水密桃12个6斤装");
            entity.setPrice(107);
            entity.setPicture("nopicture.jpg");
            int result = bookdao.update(entity);
            System.out.println(result);
        } finally {
            session.close();
        }
    }


}
