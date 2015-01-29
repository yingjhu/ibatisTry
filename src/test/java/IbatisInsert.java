
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisInsert{
  public static void main(String[] args)
   throws IOException,SQLException{
   Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
   SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

   /* This would insert one record in Employee table. */
   System.out.println("Going to insert record.....");
   Employee em = new Employee("Zara", "Ali", 5000);

   smc.insert("Employee.insert", em);

   System.out.println("Record Inserted Successfully " + em.toString());

  }
} 