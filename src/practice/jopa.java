package practice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Date;

@Path("/demo")
public class jopa {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/date")
	public String getDate() {
		long ts = System.currentTimeMillis();
		Date dt = new Date(ts);
		return dt.toString();
	}

}
