package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;





public class DBConsole_main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int count, score,i = 0;
		
		ResultSet rs;
		
		MySQL mysql = new MySQL();
		
		rs = mysql.selectAll();
		
		
				DBConsole_View graph=new DBConsole_View(); 
	
				graph.setBounds(5,5,655,455);
				graph.setVisible(true);
				try {
					while(rs.next()){
						i++;
						count = rs.getInt("count");		
						score = rs.getInt("score");
						System.out.println("âÒêîÅF" + count);
						System.out.println("ìæì_ÅF" + score);
						graph.AddScore(count,score,i);
					
						
				} 
		
						
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			
			
			
			e.printStackTrace();
	}

	}

	
}
