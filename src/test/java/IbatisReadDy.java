import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisReadDy {
	public static void main(String[] args) throws IOException, SQLException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		/* This would read all records from the Employee table. */
		System.out.println("Going to read records.....");
		Employee rec = new Employee();
		rec.setId(7);

		String string = "Employee.findByID";
		@SuppressWarnings("unchecked")
		List<Employee> ems = (List<Employee>) smc.queryForList(
				string, rec);
		for (Employee e : ems) {
			System.out.print("  " + e.getId());
			System.out.print("  " + e.getFirstName());
			System.out.print("  " + e.getLastName());
			System.out.print("  " + e.getSalary());
			System.out.println("");
		}

		System.out.println("Records Read Successfully ");

	}

}
