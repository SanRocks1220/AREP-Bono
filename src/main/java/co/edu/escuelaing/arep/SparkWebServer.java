package co.edu.escuelaing.arep;

import static spark.Spark.*;

public class SparkWebServer {
    
    public static void main(String... args){
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");

        get("sin", (req,res) -> Functionalities.sin(req.queryParams("number")));
        get("cos", (req,res) -> Functionalities.cosin(req.queryParams("number")));
        get("palindrome", (req,res) -> Functionalities.palindrome(req.queryParams("word")));
        get("magnitude", (req,res) -> Functionalities.magnitude(req.queryParams("int1"), req.queryParams("int2")));
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}