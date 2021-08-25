package DesignPattern;

import org.json.JSONObject;


//this code is examplery for Adapter Design Pattern.
public class Program {
    public static void main(String[] args) {
        String webhost = "Host:https://google.com\n\r";
        WebService service = new WebService(webhost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);
        WebClient client = new WebClient(adapter);
        client.doWork();

    }

    public interface WebRequester{
        public int request(Object object);
    }

    public static class WebClient{
        private WebRequester webRequester;

        public WebClient(WebRequester webRequester){
            this.webRequester = webRequester;
        }

        private Object makeObject(){
            Object ob = new Object();
            return ob;
        }

        public void doWork(){
            Object object = makeObject();
            int status = webRequester.request(object);
            if (status == 200) {
                System.out.println("Ok");
            }else{
                System.out.println("Not OK");
            }
            return;
        }
    }
    public static class WebAdapter implements WebRequester{
        private WebService service;

        public void connect(WebService curService){
            this.service = curService;
        }
        public int request(Object request){
            JSONObject result = toJson(request);
            JSONObject response = service.request(result);
            
            if (response != null) {
                return 200;//Okay status code;
            }
            return 500;//Server error code;
        }

        private JSONObject toJson(Object input){
            JSONObject ob = new JSONObject(input);
            return ob;
        }
    }

    public static class WebService{
        String host;
        WebService(String host){
            this.host = host;
        }
        public JSONObject request(JSONObject result){
            return result;
        }
    }
    
}
