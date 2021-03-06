package atj;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.TEXT_HTML)
@Path("/exchangerates/rate/c/")
public class Rest {

	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/{currency}/last/{days}")
	// public String methodJSON(@PathParam("currency") String currency,
	// @PathParam("days") int days) {
	// WalutaClient walutaClient=new WalutaClient();
	// double avg=walutaClient.askNBP(currency, days);
	// return "{\"avg\": " + avg + "}";
	// }

	// @GET
	// @Produces(MediaType.TEXT_HTML)
	// @Path("{currency}/last/{days}")
	// public String methodXML(@PathParam("currency") String currency,
	// @PathParam("days") int days) {
	//
	// WalutaClient walutaClient=new WalutaClient();
	// double avg=walutaClient.askNBP(currency, days);
	//
	// return "<html><body><h1>Kurs z:" + days + currency+"</h1></body></html>";
	//
	// }

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("{currency}/last/{days}")
	
	public String sayHelloHTML(@PathParam("currency") String currency, @PathParam("days") int days) 
	
	{
		
		WalutaClient walutaClient=new WalutaClient();
		double avg=walutaClient.askNBP(currency, days);
		return "<html><body><h1>Hello " + "waluta  " + currency + " ilosc dni  "+ days + " sredni kurs " + avg + "</h1></body></html>";
	}

}
