

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static final SqlSessionFactory SQL_SESSION_FACTORY;
    private static final String MYBATIS_CONFIG_FILE = "mybatis-config.xml";
    static {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream(MYBATIS_CONFIG_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SQL_SESSION_FACTORY = new  SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return SQL_SESSION_FACTORY;
    }

    public static SqlSession getSqlsession(boolean autoAmout) {
        return SQL_SESSION_FACTORY.openSession(autoAmout);
    }
    public static SqlSession getSqlsession() {
        return SQL_SESSION_FACTORY.openSession();
    }
}
