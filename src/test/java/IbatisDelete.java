import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisDelete {
	public static void main(String[] args) throws IOException, SQLException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		/* This would delete one record in Employee table. */
		System.out.println("Going to delete record.....");
		int id = 2;

		smc.delete("Employee.delete", id);
		System.out.println("Record deleted Successfully ");

		System.out.println("Going to read records.....");
		@SuppressWarnings("unchecked")
		List<Employee> ems = (List<Employee>) smc.queryForList(
				"Employee.getAll", null);
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