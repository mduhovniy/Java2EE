package items.copy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// test on :   http://localhost:8080/RESTful/rest/hello   (/rest/ url pattern defined in web.xml)
@Path("/items")
public class ItemService {

	private static Map<String, ItemCart> carts=new HashMap<String, ItemCart>();
  
	
  @Path("/createCart")
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String createCart() {
	String token=null;
	do{
       token=(int)(Math.random()*10000)+"";
	}while(carts.get(token)!=null);
    carts.put(token,new ItemCart());
    return token;
  }

  @Path("{token}")
  @GET
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public Item[] getAllItems(@PathParam("token") String token) {
	 List<Item> temp= carts.get(token).getAll();
	 Item[] items=new Item[temp.size()];
     return temp.toArray(items);
  }

  
  
  @Path("{token}")
  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public String addItem(@PathParam("token") String token, @QueryParam("name") String name, @QueryParam("price") String price) {
	  Item i=new Item(name, Float.parseFloat(price));
    carts.get(token).addItem(i);
    return name+" added";
  }
  
  @Path("{token}")
  @DELETE
  @Produces(MediaType.TEXT_PLAIN)
  public String removeItem(@PathParam("token") String token, @QueryParam("name") String name) {
    carts.get(token).removeItem(name);
    return name+" removed";
  }

} 
