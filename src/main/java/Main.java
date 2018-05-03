import java.net.URL;

import com.triniforce.pk.soap.PKApiLocator;
import com.triniforce.pk.soap.PKApiSoap;
import com.triniforce.pk.soap.SelectRequest;
import com.triniforce.pk.soap.SelectResponse;

public class Main {

	
	static void printResponse(String title, SelectResponse res){
		System.out.println(title);
		for(Object row[]: res.getRows()){
			for(Object col: row){
				System.out.print(" " + col);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) throws Exception {
		PKApiLocator loc = new PKApiLocator();
		PKApiSoap api = loc.getPKApiSoap(new URL("http://localhost:8080/alpha/soap"));
		
		final String session = "usrpwd:Admin:q";
		
		// `Issues` folder
		final long folderId =  17102;
		
		final String ftIssue = "com.triniforce.server.plugins.kernel.files.FTIssue";
		final String ftOutline = "com.triniforce.server.plugins.kernel.cd.CDOutline";

		// Create i1 inside some `Issues` folder
		
		long i1 = api.create(session, folderId, ftIssue, new Object[]{"name", "issue1"});

		// i1_1 and i1_2 are sub-issues of i1
		
		api.create(session, i1, ftIssue, new Object[]{"name", "issue1_1"});
		api.create(session, i1, ftIssue, new Object[]{"name", "issue1_2"});
		
		// Same for i2 and i2_1
		
		long i2 = api.create(session, folderId, ftIssue, new Object[]{"name", "issue2"});
		api.create(session, i2, ftIssue, new Object[]{"name", "issue2_1"});

		
		/*
		 * 
		 * Now call CDOutline: https://www.projectkaiser.com/online/#!3019389
		 * Only top level tasks are listed ("P", "0")
		 */
		
		SelectRequest sr = new SelectRequest();
		sr.setArgs(new Object[]{"P", "0"});
		sr.setColumns(new String[]{"name"});
		sr.setFiletype(ftOutline);
		sr.setParentId(folderId);
		SelectResponse res = api.select(session, sr);
		printResponse("=== Top-level issues", res);
		
		// List subtasks
		sr.setArgs(new Object[]{"P", "1"});
		printResponse("=== Issues with sub-issues", api.select(session, sr));
		
		
		// Add filter condition
		sr.setArgs(new Object[]{"P", "0"});
		sr.setSimpleWhere(new Object[]{"name", "issue2"});
		printResponse("=== Only '`issue2`", api.select(session, sr));	
		

	}

}
