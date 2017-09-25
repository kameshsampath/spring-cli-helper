package demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import demo.model.SpringDependencies;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class Helper {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper()
                .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false)
                .configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false)
                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL);

        SpringInitializrClient springInitializrClient = Feign.builder()
                .encoder(new JacksonEncoder(objectMapper))
                .decoder(new JacksonDecoder(objectMapper))
                .target(SpringInitializrClient.class, "https://start.spring.io");

        SpringDependencies response = springInitializrClient.init();

        //here you can write with JSON or convert to any format that suits the app
        System.out.println(response);

    }
}
