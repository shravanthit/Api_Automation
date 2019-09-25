package apiPage;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class requestPage {


    public static String getUrl = "https://jsonplaceholder.typicode.com/posts";
    public static String getSinglePosturl = "https://jsonplaceholder.typicode.com/posts/3";

    public static HttpResponse<JsonNode> response;

    public void get_response() throws UnirestException {
        requestPage.response = Unirest.get( getUrl ).asJson();

    }

    public boolean verifyPostAvailable() {
        System.out.println( "status is :" + response.getStatus() );
        System.out.println( ("response body is :" + response.getBody()) );
        return response.getStatus() == 200;
    }

    public void get_response_single_req() throws  UnirestException{
        requestPage.response =Unirest.get(getSinglePosturl ).asJson();
    }

    public boolean verifySinglePostAvailable(){
        System.out.println( "Status is:"+response.getStatus() );
        System.out.println( "response body is:"+response.getBody() );
        return response.getStatus() == 200;
    }
}

