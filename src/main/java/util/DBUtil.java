package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DBUtil {
    private static String resource="mybatis-config.xml";
    private static InputStream inputStream=null;
    private static SqlSessionFactory sqlSessionFactory=null;

    public static SqlSessionFactory getSqlSessionFactory(String environment) {
        if(sqlSessionFactory!=null){
            return sqlSessionFactory;
        }else{
            try {
                inputStream=Resources.getResourceAsStream(resource);
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream,environment);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(inputStream!=null)
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return sqlSessionFactory;
    }
}
