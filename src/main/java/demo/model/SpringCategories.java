package demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpringCategories {

    @JsonProperty("values")
    List<SpringCategories> categories;

    String name;
    String id;
    String description;

    @JsonProperty("_links")
    Link link;
}
