package demo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("bootVersion")
public class SpringDependencies {

    @JsonProperty("dependencies")
    SpringDependencies springDependencies;

    @JsonProperty("values")
    List<SpringCategories> categories;
}
