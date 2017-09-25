package demo;


import demo.model.SpringDependencies;
import feign.Headers;
import feign.RequestLine;

public interface SpringInitializrClient {

    @RequestLine("GET /")
    @Headers({"Accept: application/vnd.initializr.v2.1+json,application/vnd.initializr.v2+json"})
    SpringDependencies init();
}
